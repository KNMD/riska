package me.zyly.riska.manage;

import me.zyly.riska.core.CoreConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author David on 17/4/24.
 */
@EnableAutoConfiguration
@ComponentScan({"me.zyly.riska.manage.controller", "me.zyly.riska.manage.service"})
@Import(CoreConfig.class)
public class Boot extends WebMvcConfigurerAdapter {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Boot.class, args);
    }

    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
        exceptionResolvers.add(new ExtendExceptionResolver());
    }

    @Bean
    public TaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(10);
        return executor;
    }

    public static class ExtendExceptionResolver extends DefaultHandlerExceptionResolver {
        private static final Logger LOGGER = LoggerFactory.getLogger(ExtendExceptionResolver.class);
        @Override
        public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response,
                                             Object handler, Exception ex) {
            if (shouldApplyTo(request, handler)) {
//                if (this.logger.isDebugEnabled()) {
//                    this.logger.debug("Resolving exception from handler [" + handler + "]: " + ex);
//                }
                prepareResponse(ex, response);
                ModelAndView result = handleExtendException(ex, request, response, handler);
                if(null == result) {
                    result = doResolveException(request, response, handler, ex);
                }
                if (result != null) {
                    logException(ex, request);
                }
                return result;
            } else {
                return null;
            }
        }

        @SuppressWarnings("unused")
        private ModelAndView handleExtendException(Exception ex, HttpServletRequest request,
                                                   HttpServletResponse response, Object handler) {
            try {
                if(ex instanceof HttpStatusCodeException) {
                    HttpStatusCodeException httpStatusCodeException = (HttpStatusCodeException) ex;
                    response.sendError(httpStatusCodeException.getStatusCode().value());
                    ModelAndView modelAndView = new ModelAndView();
                    modelAndView.setStatus(httpStatusCodeException.getStatusCode());
                    return modelAndView;
                }
            } catch (IOException e) {
                LOGGER.error("Extend exception resolver:{}", e);
            }
            return null;
        }
    }
}
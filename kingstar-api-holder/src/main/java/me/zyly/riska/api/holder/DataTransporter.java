package me.zyly.riska.api.holder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;
import java.util.concurrent.*;

public class DataTransporter<T> {
    private Consumer<T> consumer;
    private BlockingQueue<T> queue = new LinkedBlockingQueue<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(DataTransporter.class);
    private static final ExecutorService consumerThread = Executors.newCachedThreadPool();
    private volatile boolean continueConsume = true;
    interface Consumer<T> {
        void consume(T data) throws Exception;
    }
    DataTransporter(Consumer<T> consumer) {
        this.consumer = consumer;
    }
    void produce(T data) throws Exception{
        try {
            queue.put(data);
            LOGGER.debug("put data success");
        } catch (InterruptedException e) {
            LOGGER.error("put timeout", e);
        }
    }

    @SuppressWarnings("WeakerAccess")
    void stopConsume() {
        this.continueConsume = false;
        LOGGER.info("consumer stopped! but may be has the last take.");
    }

    void doWork() {
        consumerThread.execute(() -> {
            while(continueConsume) {
                try {
                    T data = queue.take();
                    LOGGER.debug("consume status:{}, data send to custom consumer", continueConsume);
                    consumerThread.execute(() -> {
                        try {
                            consumer.consume(data);
                        } catch (Exception e) {
                            LOGGER.error("consume doing error", e);
                        }
                    });
                } catch (InterruptedException e) {
                    LOGGER.info("queue take interrupt, will retry after sleep 5 seconds");
                    try {
                        TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException e1) {
                        LOGGER.error("sleep retry error, ", e1);
                    }
                }
            }
        });
    }

}

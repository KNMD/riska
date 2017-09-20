package me.zyly.riska.core.service;

import me.zyly.riska.core.domain.QueryCache;
import me.zyly.riska.core.repository.QueryCacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryCacheService<T> {

    private @Autowired QueryCacheRepository<T> queryCacheRepository;
    private static final long DEFAULT_EXPIRE_TIME = 1000 * 60;

    public void save(String key, T data) {
        save(key, data, DEFAULT_EXPIRE_TIME + System.currentTimeMillis());
    }

    public void save(String key, T data, boolean hibernate) {
        long expire = hibernate ? 0 : DEFAULT_EXPIRE_TIME + System.currentTimeMillis();
        save(key, data, expire);
    }

    private void save(String key, T data, long expire) {
        QueryCache<T> queryCache = new QueryCache<>();
        queryCache.setKey(key);
        queryCache.setData(data);
        queryCache.setExpireTimestamp(expire);
        queryCacheRepository.save(queryCache);
    }

    public T get(String key) throws GetError{
        QueryCache<T> cache = queryCacheRepository.findOneByKey(key);
        if(null == cache) {
            throw new Null();
        }else {
            if(0 != cache.getExpireTimestamp() &&
                    cache.getExpireTimestamp() < System.currentTimeMillis()) {
                throw new Expire();
            }
            return cache.getData();
        }
    }

    public static class GetError extends Exception{}
    public static class Expire extends GetError {}
    public static class Null extends GetError {}
}

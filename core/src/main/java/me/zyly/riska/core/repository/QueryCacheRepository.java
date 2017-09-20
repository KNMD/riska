package me.zyly.riska.core.repository;

import me.zyly.riska.core.domain.QueryCache;
import org.springframework.data.repository.CrudRepository;

public interface QueryCacheRepository<T> extends CrudRepository<QueryCache<T>, String>{
    QueryCache<T> findOneByKey(String key);
}

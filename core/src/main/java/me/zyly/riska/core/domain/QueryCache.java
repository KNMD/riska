package me.zyly.riska.core.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@CompoundIndex(name = "key_unique", def = "{'key': 1}", unique = true)
public class QueryCache<T> {
    @Indexed(unique = true)
    private String key;
    private T data;
    private long expireTimestamp;
}

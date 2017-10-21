package me.zyly.riska.core.domain;

import lombok.Data;

@Data
public class InstrumentInfo {
    private String id;
    private String type;
    private String day;
    private Integer offset;
    private Integer cumOffset;
}

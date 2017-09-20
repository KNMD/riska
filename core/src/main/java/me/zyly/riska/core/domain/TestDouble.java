package me.zyly.riska.core.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TestDouble {
    private String id;
    private Double price;
    private double price2;
    private BigDecimal price3;
}

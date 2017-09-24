package me.zyly.riska.manage.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SingleMarketData {
    private String label;
    private int open;
    private int close;
    private int highest;
    private int lowest;
    private int tradingDay;
    private String time;

    public SingleMarketData(int price) {
        this.open = price;
        this.close = price;
        this.highest = price;
        this.lowest = price;
    }

    public SingleMarketData(String label, int price) {
        this(price);
        this.label = label;
    }
}

package me.zyly.riska.manage.domain;

import lombok.Data;
import java.math.BigDecimal;
import java.math.RoundingMode;

@Data
public class Scope {
    private double rate;
    private int range;
    private int min;
    private int max;
    private int center;
    //循环时遇到此条件强制调到下一个k线
    private boolean forceAdd = false;
    public enum Direction {
        UP, DOWN
    }
    public interface Algorithm {
        Scope calculate(double rate, int price);

        class IC implements Algorithm {
            @Override
            public Scope calculate(double rate, int price) {
                BigDecimal total = new BigDecimal(String.valueOf(price)),
                        result = total.multiply(new BigDecimal(String.valueOf(rate))).setScale(0, RoundingMode.UP);
                int range = result.intValue();
                range = ((range & 1) == 1) ? range + 1 : range;
                int min = price - range,
                        max = price + range;
                Scope scope = new Scope();
                scope.setRate(rate);
                scope.setMin(min);
                scope.setMax(max);
                scope.setCenter(price);
                scope.setRange(range);
                return scope;
            }
        }
    }


}

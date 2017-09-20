package me.zyly.riska.manage.domain;

import lombok.Data;
import java.math.BigDecimal;
import java.math.RoundingMode;

@Data
public class Scope {
    private double rate;
    private int range;
    private int offset;
    private int min;
    private int max;
    private int base;
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
                        result = total.multiply(new BigDecimal(String.valueOf(rate))).setScale(1, RoundingMode.UP);
                int range = result.intValue(),
                    min = price - range,
                    max = price + range;
                min = ((min & 1) == 1) ? min + 1 : min;
                max = ((max & 1) == 1) ? max + 1 : max;
                Scope scope = new Scope();
                scope.setRate(rate);
                scope.setMin(min);
                scope.setMax(max);
                scope.setRange(range);
                scope.setBase(price);
                scope.setOffset(scope.getRange());
                return scope;
            }
        }
    }


}

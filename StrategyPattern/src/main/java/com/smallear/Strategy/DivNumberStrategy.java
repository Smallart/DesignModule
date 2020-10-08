package com.smallear.Strategy;

public class DivNumberStrategy implements BaseStrategy<Integer> {
    @Override
    public Integer calculateNumbers(Integer num1, Integer num2) {
        return num1-num2;
    }
}

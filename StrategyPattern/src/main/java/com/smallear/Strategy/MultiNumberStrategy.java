package com.smallear.Strategy;

public class MultiNumberStrategy implements BaseStrategy<Integer> {
    @Override
    public Integer calculateNumbers(Integer num1, Integer num2) {
        return num1*num2;
    }
}

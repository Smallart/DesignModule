package com.smallear.Strategy;

public class StrategyManage implements BaseStrategy<Integer> {
    private BaseStrategy<Integer> baseStrategy;
    public StrategyManage(OperateType type) {
        switch (type){
            case ADD:
                baseStrategy=new AddNumberStrategy();
                break;
            case DIV:
                baseStrategy=new DivNumberStrategy();
                break;
            case MuTIL:
                baseStrategy=new MultiNumberStrategy();
                break;
        }
    }

    @Override
    public Integer calculateNumbers(Integer num1, Integer num2) {
        return baseStrategy.calculateNumbers(num1,num2);
    }
}

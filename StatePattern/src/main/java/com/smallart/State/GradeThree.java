package com.smallart.State;

public class GradeThree implements Grade {
    @Override
    public void showGrade(Person p) {
        if (p.getGradeLevel()<30){
            System.out.println("黄金");
        }else {
            System.out.println("目前段位最高黄金，之后完善该排位等级");
        }
    }
}

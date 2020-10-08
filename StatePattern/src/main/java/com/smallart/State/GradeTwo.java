package com.smallart.State;

public class GradeTwo implements Grade {
    @Override
    public void showGrade(Person p) {
        if (p.getGradeLevel()<20){
            System.out.println("白银");
        }else {
            p.setGrade(new GradeThree());
            p.showGrade();
        }
    }
}

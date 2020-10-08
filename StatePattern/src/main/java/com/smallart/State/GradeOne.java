package com.smallart.State;

public class GradeOne implements Grade {
    @Override
    public void showGrade(Person person) {
        if (person.getGradeLevel()<10){
            System.out.println("青铜");
        }else {
            person.setGrade(new GradeTwo());
            person.showGrade();
        }

    }
}

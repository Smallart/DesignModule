package com.smallart;

public class PersonLevel {
    private int grade;

    public PersonLevel(int grade) {
        this.grade = grade;
    }

    /**
     * 如果有大量的条件判断都写在一个方法中的话，一个是代码量太多，二是后期不好维护，此时就可以将其抽出
     */
    public void showGrade(){
        System.out.print("召唤师，您当前召唤师段位：");
        if (grade<10){
            System.out.println("青铜");
        }else if (grade<20){
            System.out.println("白银");
        }else if (grade<30){
            System.out.println("黄金");
        }else if (grade<40){
            System.out.println("铂金");
        }else if (grade<50){
            System.out.println("砖石");
        }else {
            System.out.println("王者");
        }
    }
}

package com.smallart;

/**
 * Hello world!
 * String 类型不需要深克隆，修改的话指向常量池里的String
 */
public class App 
{
    public static void main( String[] args ) throws CloneNotSupportedException {
        Person person = new Person();
        person.setName("张山");
        person.setAge(20);
        person.setGender("女");
        person.hobby="play game";
        person.setLocation(new Location("张家庄"));
        Person clonePerson = person.clone();
        System.out.println(clonePerson==person);
        System.out.println("姓名"+clonePerson.getName()+":姓名"+person.getName());
        System.out.println(clonePerson.getLocation()==person.getLocation());
        System.out.println("Hobby :"+person.hobby);
        clonePerson.hobby = "watch TV";
        System.out.println("Hobby :"+person.hobby);
    }
}

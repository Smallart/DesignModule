package com.smaller.other;

public class Person {
    private int age;
    private String name;
    private int score;
    private double weight;
    private Location loc;

    private Person(){}

    public static class PersonBuilder{
        Person person = new Person();

        public PersonBuilder basicInfo(String name,int age,double weight){
             person.age=age;
             person.name=name;
             person.weight =weight;
             return this;
        }

        public PersonBuilder setScore(int score){
            person.score = score;
            return this;
        }

        public PersonBuilder setLocation(int x,int y){
            person.loc = new Location(x,y);
            return this;
        }

        public Person build(){
            return person;
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", weight=" + weight +
                ", loc=" + loc +
                '}';
    }
}

class Location{
    private int positionX;
    private int positionY;

    public Location(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }
}

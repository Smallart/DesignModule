package com.smallart;

import com.smallart.State.GradeOne;
import com.smallart.State.Person;

/**
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person person = new Person(50,new GradeOne());
        person.showGrade();
    }
}

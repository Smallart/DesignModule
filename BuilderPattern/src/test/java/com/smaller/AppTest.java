package com.smaller;

import static org.junit.Assert.assertTrue;

import com.smaller.other.Builder;
import com.smaller.other.Person;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Builder builder = new Builder();
        StringBuffer build = builder.buildIceField().buildTank().buildForest().build();
        System.out.println(build.toString());
    }

    @Test
    public void getPerson(){
        Person.PersonBuilder personBuilder = new Person.PersonBuilder();
        Person person = personBuilder.basicInfo("张山", 20, 60.5).setScore(80).build();
        System.out.println(person);
    }
}

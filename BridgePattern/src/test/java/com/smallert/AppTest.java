package com.smallert;

import static org.junit.Assert.assertTrue;

import com.smallert.solve.Calculate;
import com.smallert.solve.ViVO;
import com.smallert.solve.Iphone;
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
        Iphone iphone =new ViVO(new Calculate());
        iphone.run();
    }
}

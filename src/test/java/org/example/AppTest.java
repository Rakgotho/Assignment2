package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Ignore;
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
        assertTrue( true );
    }
    @Ignore
    @Test
    public void disableTest()
    {
        Assert.assertEquals("","");
        System.out.println("This methods is null and void");

    }
    @Test
    public void failingTest()
    {
        Assert.assertEquals("1","");
        System.out.println("This method performs test failing meaning the test wont test");

    }
    @Test
    public void objIdentity()
    {
        Assert.assertNotSame("1", "");

    }
    @Test
    public void objEquals()
    {
        Assert.assertEquals("1", "1");

    }
    @Test (timeout = 500)
    public void timeOut() throws InterruptedException {
      while (true)
      {
          Thread.currentThread().sleep(1000);

      }





    }


}

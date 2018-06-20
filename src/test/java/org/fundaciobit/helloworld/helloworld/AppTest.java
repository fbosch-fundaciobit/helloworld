package org.fundaciobit.helloworld.helloworld;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        
        int v = new Calculadora().suma(2,3);
        System.out.println(v);
        assertEquals(5, v);
        
        int j = new Calculadora().suma(7,2);
        System.out.println(j);
        assertEquals(5, j);
    }
}

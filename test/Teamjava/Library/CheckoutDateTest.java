/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Teamjava.Library;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.*;


/**
 *
 * @author tyler
 */
public class CheckoutDateTest
{
    
    public CheckoutDateTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of advanceDate method, of class CheckoutDate.
     */
    @Test
    public void testAdvanceDate()
    {
        System.out.println("advanceDate");
//        CheckoutDate dateCheckedOut = new CheckoutDate();
//        int numDays = 3;
//        CheckoutDate simulatedFutureDate = new CheckoutDate();
//        simulatedFutureDate.advanceDate(numDays);
        

 
    }

    /**
     * Test of getDate method, of class CheckoutDate.
     */
    @Test
    public void testGetDate()
    {
        System.out.println("getDate");
        CheckoutDate instance = new CheckoutDate();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

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
import static org.junit.Assert.*;

/**
 *
 * @author tyler
 */
public class BookTest
{
    
    public BookTest()
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
     * Test of modifyStatus method, of class Book.
     */
    @Test
    public void testModifyStatus()
    {
        System.out.println("modifyStatus");
        Book instance = null;
        instance.modifyStatus();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCheckedOut method, of class Book.
     */
    @Test
    public void testIsCheckedOut()
    {
        System.out.println("isCheckedOut");
        Book instance = null;
        boolean expResult = false;
        boolean result = instance.isCheckedOut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isChildrenBook method, of class Book.
     */
    @Test
    public void testIsChildrenBook()
    {
        System.out.println("isChildrenBook");
        Book instance = null;
        boolean expResult = false;
        boolean result = instance.isChildrenBook();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAdultBook method, of class Book.
     */
    @Test
    public void testIsAdultBook()
    {
        System.out.println("isAdultBook");
        Book instance = null;
        boolean expResult = false;
        boolean result = instance.isAdultBook();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMedia method, of class Book.
     */
    @Test
    public void testIsMedia()
    {
        System.out.println("isMedia");
        Book instance = null;
        boolean expResult = false;
        boolean result = instance.isMedia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Book.
     */
    @Test
    public void testGetDescription()
    {
        System.out.println("getDescription");
        Book instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of daysOut method, of class Book.
     */
    @Test
    public void testDaysOut()
    {
        System.out.println("daysOut");
        Book instance = null;
        int expResult = 0;
        int result = instance.daysOut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maxLoanTime method, of class Book.
     */
    @Test
    public void testMaxLoanTime()
    {
        System.out.println("maxLoanTime");
        Book instance = null;
        int expResult = 0;
        int result = instance.maxLoanTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of whoHasIt method, of class Book.
     */
    @Test
    public void testWhoHasIt()
    {
        System.out.println("whoHasIt");
        Book instance = null;
        Object expResult = null;
        Object result = instance.whoHasIt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loanStarted method, of class Book.
     */
    @Test
    public void testLoanStarted()
    {
        System.out.println("loanStarted");
        Book instance = null;
        String expResult = "";
        String result = instance.loanStarted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBookTitle method, of class Book.
     */
    @Test
    public void testGetBookTitle()
    {
        System.out.println("getBookTitle");
        Book instance = null;
        String expResult = "";
        String result = instance.getBookTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setloaner method, of class Book.
     */
    @Test
    public void testSetloaner()
    {
        System.out.println("setloaner");
        String holder = "";
        Book instance = null;
        instance.setloaner(holder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetDaysOut method, of class Book.
     */
    @Test
    public void testResetDaysOut() {
        System.out.println("resetDaysOut");
        Book instance = null;
        instance.resetDaysOut();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incrementDay method, of class Book.
     */
    @Test
    public void testIncrementDay() {
        System.out.println("incrementDay");
        Book instance = null;
        instance.incrementDay();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

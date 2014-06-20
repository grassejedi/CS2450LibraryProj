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
 * @author Sean
 */
public class _DateTest {
    
    public _DateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of increaseDay method, of class _Date.
     */
    @Test
    public void testIncreaseDay() {
        System.out.println("increaseDay");
        _Date instance = new _Date();
        instance.increaseDay();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class _Date.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        _Date instance = new _Date();
        int expResult = 0;
        int result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateMMDDYY method, of class _Date.
     */
    @Test
    public void testGetDateMMDDYY() {
        System.out.println("getDateMMDDYY");
        _Date instance = new _Date();
        String expResult = "";
        String result = instance.getDateMMDDYY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of yearDateToCalendar method, of class _Date.
     */
    @Test
    public void testYearDateToCalendar() {
        System.out.println("yearDateToCalendar");
        int yearDay = 0;
        _Date instance = new _Date();
        String expResult = "";
        String result = instance.yearDateToCalendar(yearDay);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

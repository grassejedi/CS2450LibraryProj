/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Teamjava.Library;

import java.util.List;
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
public class CirculationTest
{
    
    public CirculationTest()
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

    @Test
    public void testSomeMethod()
    {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBookFileName method, of class Circulation.
     */
    @Test
    public void testSetBookFileName() {
        System.out.println("setBookFileName");
        String file = "";
        Circulation instance = new Circulation();
        instance.setBookFileName(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkOut method, of class Circulation.
     */
    @Test
    public void testCheckOut() {
        System.out.println("checkOut");
        String bTitle = "";
        String pName = "";
        Circulation instance = new Circulation();
        instance.checkOut(bTitle, pName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkIn method, of class Circulation.
     */
    @Test
    public void testCheckIn() {
        System.out.println("checkIn");
        String bTitle = "";
        String pName = "";
        Circulation instance = new Circulation();
        instance.checkIn(bTitle, pName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listOverdueBooks method, of class Circulation.
     */
    @Test
    public void testListOverdueBooks() {
        System.out.println("listOverdueBooks");
        Circulation instance = new Circulation();
        List expResult = null;
        List result = instance.listOverdueBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCheckedOutByPatron method, of class Circulation.
     */
    @Test
    public void testListCheckedOutByPatron() {
        System.out.println("listCheckedOutByPatron");
        String pName = "";
        Circulation instance = new Circulation();
        List expResult = null;
        List result = instance.listCheckedOutByPatron(pName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listAllBooks method, of class Circulation.
     */
    @Test
    public void testListAllBooks() {
        System.out.println("listAllBooks");
        Circulation instance = new Circulation();
        List expResult = null;
        List result = instance.listAllBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of booksAvailableToPatron method, of class Circulation.
     */
    @Test
    public void testBooksAvailableToPatron() {
        System.out.println("booksAvailableToPatron");
        String pName = "";
        Circulation instance = new Circulation();
        List expResult = null;
        List result = instance.booksAvailableToPatron(pName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Exit method, of class Circulation.
     */
    @Test
    public void testExit() {
        System.out.println("Exit");
        Circulation instance = new Circulation();
        instance.Exit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printStatus method, of class Circulation.
     */
    @Test
    public void testPrintStatus() {
        System.out.println("printStatus");
        Circulation instance = new Circulation();
        String expResult = "";
        String result = instance.printStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printCurrentDate method, of class Circulation.
     */
    @Test
    public void testPrintCurrentDate() {
        System.out.println("printCurrentDate");
        Circulation instance = new Circulation();
        String expResult = "";
        String result = instance.printCurrentDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of advanceOneDay method, of class Circulation.
     */
    @Test
    public void testAdvanceOneDay() {
        System.out.println("advanceOneDay");
        Circulation instance = new Circulation();
        instance.advanceOneDay();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

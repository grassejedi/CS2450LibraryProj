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
public class PatronTest {
    
    public PatronTest() {
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
     * Test of checkout method, of class Patron.
     */
    @Test
    public void testCheckout() {
        System.out.println("checkout");
        String name1 = "";
        int number = 0;
        Patron instance = new Patron();
        boolean expResult = false;
        boolean result = instance.checkout(name1, number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkin method, of class Patron.
     */
    @Test
    public void testCheckin() {
        System.out.println("checkin");
        String name1 = "";
        int number = 0;
        Patron instance = new Patron();
        boolean expResult = false;
        boolean result = instance.checkin(name1, number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAdult method, of class Patron.
     */
    @Test
    public void testIsAdult() {
        System.out.println("isAdult");
        String name1 = "";
        Patron instance = new Patron();
        boolean expResult = false;
        boolean result = instance.isAdult(name1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numOfBooks method, of class Patron.
     */
    @Test
    public void testNumOfBooks() {
        System.out.println("numOfBooks");
        String name1 = "";
        Patron instance = new Patron();
        int expResult = 0;
        int result = instance.numOfBooks(name1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printClients method, of class Patron.
     */
    @Test
    public void testPrintClients() {
        System.out.println("printClients");
        String[] array = null;
        Patron.printClients(array);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Patron.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Patron.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

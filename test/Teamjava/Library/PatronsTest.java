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
public class PatronsTest {
    
    public PatronsTest() {
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
     * Test of exisit method, of class Patrons.
     */
    @Test
    public void testExisit() {
        System.out.println("exisit");
        Patrons instance = null;
        boolean expResult = false;
        boolean result = instance.exisit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readable method, of class Patrons.
     */
    @Test
    public void testReadable() {
        System.out.println("readable");
        Patrons instance = null;
        boolean expResult = false;
        boolean result = instance.readable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canWrite method, of class Patrons.
     */
    @Test
    public void testCanWrite() {
        System.out.println("canWrite");
        Patrons instance = null;
        boolean expResult = false;
        boolean result = instance.canWrite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PatronsList method, of class Patrons.
     */
    @Test
    public void testPatronsList() throws Exception {
        System.out.println("PatronsList");
        Patrons instance = null;
        String[] expResult = null;
        String[] result = instance.PatronsList();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of type method, of class Patrons.
     */
    @Test
    public void testType() throws Exception {
        System.out.println("type");
        String patrons_name = "";
        Patrons instance = null;
        boolean expResult = false;
        boolean result = instance.type(patrons_name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateNumber method, of class Patrons.
     */
    @Test
    public void testUpdateNumber() throws Exception {
        System.out.println("updateNumber");
        String name = "";
        int number = 0;
        Patrons instance = null;
        int expResult = 0;
        int result = instance.updateNumber(name, number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

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
public class CatalogTest
{
    
    public CatalogTest()
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
     * Test of setFileName method, of class Catalog.
     */
    @Test
    public void testSetFileName()
    {
        System.out.println("setFileName");
        Catalog instance = new Catalog();
        instance.setFileName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of openFile method, of class Catalog.
     */
    @Test
    public void testOpenFile()
    {
        System.out.println("openFile");
        String fileName = "";
        Catalog instance = new Catalog();
        instance.openFile(fileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of populateCatalog method, of class Catalog.
     */
    @Test
    public void testPopulateCatalog()
    {
        System.out.println("populateCatalog");
        Catalog instance = new Catalog();
        instance.populateCatalog();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createBook method, of class Catalog.
     */
    @Test
    public void testCreateBook()
    {
        System.out.println("createBook");
        String bookInfo = "";
        Catalog instance = new Catalog();
        Book expResult = null;
        Book result = instance.createBook(bookInfo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayBookStatus method, of class Catalog.
     */
    @Test
    public void testDisplayBookStatus()
    {
        System.out.println("displayBookStatus");
        Catalog instance = new Catalog();
        String expResult = "";
        String result = instance.displayBookStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayOverDueBooks method, of class Catalog.
     */
    @Test
    public void testDisplayOverDueBooks()
    {
        System.out.println("displayOverDueBooks");
        Catalog instance = new Catalog();
        List<Book> expResult = null;
        List<Book> result = instance.displayOverDueBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayBooksByHolder method, of class Catalog.
     */
    @Test
    public void testDisplayBooksByHolder()
    {
        System.out.println("displayBooksByHolder");
        String holder = "";
        Catalog instance = new Catalog();
        List<Book> expResult = null;
        List<Book> result = instance.displayBooksByHolder(holder);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

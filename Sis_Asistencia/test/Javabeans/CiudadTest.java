/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Javabeans;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author platano
 */
public class CiudadTest {
    
    public CiudadTest() {
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
     * Test of getIdciu method, of class Ciudad.
     */
    @Test
    public void testGetIdciu() {
        System.out.println("getIdciu");
        Ciudad instance = new Ciudad();
        int expResult = 0;
        int result = instance.getIdciu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdciu method, of class Ciudad.
     */
    @Test
    public void testSetIdciu() {
        System.out.println("setIdciu");
        int idciu = 0;
        Ciudad instance = new Ciudad();
        instance.setIdciu(idciu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Ciudad.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Ciudad instance = new Ciudad();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Ciudad.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Ciudad instance = new Ciudad();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

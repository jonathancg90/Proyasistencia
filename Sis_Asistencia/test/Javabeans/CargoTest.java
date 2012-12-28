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
public class CargoTest {
    
    public CargoTest() {
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
     * Test of getIdcar method, of class Cargo.
     */
    @Test
    public void testGetIdcar() {
        System.out.println("getIdcar");
        Cargo instance = new Cargo();
        int expResult = 0;
        int result = instance.getIdcar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdcar method, of class Cargo.
     */
    @Test
    public void testSetIdcar() {
        System.out.println("setIdcar");
        int idcar = 0;
        Cargo instance = new Cargo();
        instance.setIdcar(idcar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Cargo.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Cargo instance = new Cargo();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Cargo.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Cargo instance = new Cargo();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdare method, of class Cargo.
     */
    @Test
    public void testGetIdare() {
        System.out.println("getIdare");
        Cargo instance = new Cargo();
        int expResult = 0;
        int result = instance.getIdare();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdare method, of class Cargo.
     */
    @Test
    public void testSetIdare() {
        System.out.println("setIdare");
        int idare = 0;
        Cargo instance = new Cargo();
        instance.setIdare(idare);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreated method, of class Cargo.
     */
    @Test
    public void testGetCreated() {
        System.out.println("getCreated");
        Cargo instance = new Cargo();
        String expResult = "";
        String result = instance.getCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreated method, of class Cargo.
     */
    @Test
    public void testSetCreated() {
        System.out.println("setCreated");
        String created = "";
        Cargo instance = new Cargo();
        instance.setCreated(created);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModified method, of class Cargo.
     */
    @Test
    public void testGetModified() {
        System.out.println("getModified");
        Cargo instance = new Cargo();
        String expResult = "";
        String result = instance.getModified();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModified method, of class Cargo.
     */
    @Test
    public void testSetModified() {
        System.out.println("setModified");
        String modified = "";
        Cargo instance = new Cargo();
        instance.setModified(modified);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

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
public class ModulosTest {
    
    public ModulosTest() {
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
     * Test of getIdmod method, of class Modulos.
     */
    @Test
    public void testGetIdmod() {
        System.out.println("getIdmod");
        Modulos instance = new Modulos();
        int expResult = 0;
        int result = instance.getIdmod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Modulos.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Modulos instance = new Modulos();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isState method, of class Modulos.
     */
    @Test
    public void testIsState() {
        System.out.println("isState");
        Modulos instance = new Modulos();
        boolean expResult = false;
        boolean result = instance.isState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreated method, of class Modulos.
     */
    @Test
    public void testGetCreated() {
        System.out.println("getCreated");
        Modulos instance = new Modulos();
        String expResult = "";
        String result = instance.getCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModified method, of class Modulos.
     */
    @Test
    public void testGetModified() {
        System.out.println("getModified");
        Modulos instance = new Modulos();
        String expResult = "";
        String result = instance.getModified();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdmod method, of class Modulos.
     */
    @Test
    public void testSetIdmod() {
        System.out.println("setIdmod");
        int idmod = 0;
        Modulos instance = new Modulos();
        instance.setIdmod(idmod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Modulos.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Modulos instance = new Modulos();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setState method, of class Modulos.
     */
    @Test
    public void testSetState() {
        System.out.println("setState");
        boolean state = false;
        Modulos instance = new Modulos();
        instance.setState(state);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreated method, of class Modulos.
     */
    @Test
    public void testSetCreated() {
        System.out.println("setCreated");
        String created = "";
        Modulos instance = new Modulos();
        instance.setCreated(created);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModified method, of class Modulos.
     */
    @Test
    public void testSetModified() {
        System.out.println("setModified");
        String modified = "";
        Modulos instance = new Modulos();
        instance.setModified(modified);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

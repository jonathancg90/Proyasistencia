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
public class TipoempleadoTest {
    
    public TipoempleadoTest() {
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
     * Test of getIdtip method, of class Tipoempleado.
     */
    @Test
    public void testGetIdtip() {
        System.out.println("getIdtip");
        Tipoempleado instance = new Tipoempleado();
        int expResult = 0;
        int result = instance.getIdtip();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdtip method, of class Tipoempleado.
     */
    @Test
    public void testSetIdtip() {
        System.out.println("setIdtip");
        int idtip = 0;
        Tipoempleado instance = new Tipoempleado();
        instance.setIdtip(idtip);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Tipoempleado.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Tipoempleado instance = new Tipoempleado();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Tipoempleado.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Tipoempleado instance = new Tipoempleado();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstado method, of class Tipoempleado.
     */
    @Test
    public void testIsEstado() {
        System.out.println("isEstado");
        Tipoempleado instance = new Tipoempleado();
        boolean expResult = false;
        boolean result = instance.isEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Tipoempleado.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        boolean estado = false;
        Tipoempleado instance = new Tipoempleado();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreated method, of class Tipoempleado.
     */
    @Test
    public void testGetCreated() {
        System.out.println("getCreated");
        Tipoempleado instance = new Tipoempleado();
        String expResult = "";
        String result = instance.getCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreated method, of class Tipoempleado.
     */
    @Test
    public void testSetCreated() {
        System.out.println("setCreated");
        String created = "";
        Tipoempleado instance = new Tipoempleado();
        instance.setCreated(created);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModified method, of class Tipoempleado.
     */
    @Test
    public void testGetModified() {
        System.out.println("getModified");
        Tipoempleado instance = new Tipoempleado();
        String expResult = "";
        String result = instance.getModified();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModified method, of class Tipoempleado.
     */
    @Test
    public void testSetModified() {
        System.out.println("setModified");
        String modified = "";
        Tipoempleado instance = new Tipoempleado();
        instance.setModified(modified);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

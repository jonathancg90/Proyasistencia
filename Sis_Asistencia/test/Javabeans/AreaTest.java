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
public class AreaTest {
    
    public AreaTest() {
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
     * Test of getIdare method, of class Area.
     */
    @Test
    public void testGetIdare() {
        System.out.println("getIdare");
        Area instance = new Area();
        int expResult = 0;
        int result = instance.getIdare();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdare method, of class Area.
     */
    @Test
    public void testSetIdare() {
        System.out.println("setIdare");
        int idare = 0;
        Area instance = new Area();
        instance.setIdare(idare);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Area.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Area instance = new Area();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Area.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Area instance = new Area();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreated method, of class Area.
     */
    @Test
    public void testGetCreated() {
        System.out.println("getCreated");
        Area instance = new Area();
        String expResult = "";
        String result = instance.getCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreated method, of class Area.
     */
    @Test
    public void testSetCreated() {
        System.out.println("setCreated");
        String created = "";
        Area instance = new Area();
        instance.setCreated(created);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModified method, of class Area.
     */
    @Test
    public void testGetModified() {
        System.out.println("getModified");
        Area instance = new Area();
        String expResult = "";
        String result = instance.getModified();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModified method, of class Area.
     */
    @Test
    public void testSetModified() {
        System.out.println("setModified");
        String modified = "";
        Area instance = new Area();
        instance.setModified(modified);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getState method, of class Area.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        Area instance = new Area();
        boolean expResult = false;
        boolean result = instance.getState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setState method, of class Area.
     */
    @Test
    public void testSetState() {
        System.out.println("setState");
        boolean estado = false;
        Area instance = new Area();
        instance.setState(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

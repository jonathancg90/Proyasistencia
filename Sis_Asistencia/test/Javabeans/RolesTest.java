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
public class RolesTest {
    
    public RolesTest() {
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
     * Test of getIdrol method, of class Roles.
     */
    @Test
    public void testGetIdrol() {
        System.out.println("getIdrol");
        Roles instance = new Roles();
        int expResult = 0;
        int result = instance.getIdrol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdrol method, of class Roles.
     */
    @Test
    public void testSetIdrol() {
        System.out.println("setIdrol");
        int idrol = 0;
        Roles instance = new Roles();
        instance.setIdrol(idrol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Roles.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Roles instance = new Roles();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Roles.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Roles instance = new Roles();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

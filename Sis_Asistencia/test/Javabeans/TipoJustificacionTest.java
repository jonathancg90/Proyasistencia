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
public class TipoJustificacionTest {
    
    public TipoJustificacionTest() {
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
     * Test of getIdjus method, of class TipoJustificacion.
     */
    @Test
    public void testGetIdjus() {
        System.out.println("getIdjus");
        TipoJustificacion instance = new TipoJustificacion();
        int expResult = 0;
        int result = instance.getIdjus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdjus method, of class TipoJustificacion.
     */
    @Test
    public void testSetIdjus() {
        System.out.println("setIdjus");
        int idjus = 0;
        TipoJustificacion instance = new TipoJustificacion();
        instance.setIdjus(idjus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class TipoJustificacion.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        TipoJustificacion instance = new TipoJustificacion();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class TipoJustificacion.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        TipoJustificacion instance = new TipoJustificacion();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

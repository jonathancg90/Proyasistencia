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
public class SucursalTest {
    
    public SucursalTest() {
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
     * Test of getIdsuc method, of class Sucursal.
     */
    @Test
    public void testGetIdsuc() {
        System.out.println("getIdsuc");
        Sucursal instance = new Sucursal();
        int expResult = 0;
        int result = instance.getIdsuc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdsuc method, of class Sucursal.
     */
    @Test
    public void testSetIdsuc() {
        System.out.println("setIdsuc");
        int idsuc = 0;
        Sucursal instance = new Sucursal();
        instance.setIdsuc(idsuc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Sucursal.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Sucursal instance = new Sucursal();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Sucursal.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Sucursal instance = new Sucursal();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccion method, of class Sucursal.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Sucursal instance = new Sucursal();
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccion method, of class Sucursal.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        Sucursal instance = new Sucursal();
        instance.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdciu method, of class Sucursal.
     */
    @Test
    public void testGetIdciu() {
        System.out.println("getIdciu");
        Sucursal instance = new Sucursal();
        int expResult = 0;
        int result = instance.getIdciu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdciu method, of class Sucursal.
     */
    @Test
    public void testSetIdciu() {
        System.out.println("setIdciu");
        int idciu = 0;
        Sucursal instance = new Sucursal();
        instance.setIdciu(idciu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdempr method, of class Sucursal.
     */
    @Test
    public void testGetIdempr() {
        System.out.println("getIdempr");
        Sucursal instance = new Sucursal();
        int expResult = 0;
        int result = instance.getIdempr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdempr method, of class Sucursal.
     */
    @Test
    public void testSetIdempr() {
        System.out.println("setIdempr");
        int idempr = 0;
        Sucursal instance = new Sucursal();
        instance.setIdempr(idempr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

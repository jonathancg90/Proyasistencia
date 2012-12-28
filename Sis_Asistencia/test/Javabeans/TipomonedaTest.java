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
public class TipomonedaTest {
    
    public TipomonedaTest() {
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
     * Test of getIdtipmon method, of class Tipomoneda.
     */
    @Test
    public void testGetIdtipmon() {
        System.out.println("getIdtipmon");
        Tipomoneda instance = new Tipomoneda();
        int expResult = 0;
        int result = instance.getIdtipmon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Tipomoneda.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Tipomoneda instance = new Tipomoneda();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSimbol method, of class Tipomoneda.
     */
    @Test
    public void testGetSimbol() {
        System.out.println("getSimbol");
        Tipomoneda instance = new Tipomoneda();
        String expResult = "";
        String result = instance.getSimbol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPor_defecto method, of class Tipomoneda.
     */
    @Test
    public void testIsPor_defecto() {
        System.out.println("isPor_defecto");
        Tipomoneda instance = new Tipomoneda();
        boolean expResult = false;
        boolean result = instance.isPor_defecto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreated method, of class Tipomoneda.
     */
    @Test
    public void testGetCreated() {
        System.out.println("getCreated");
        Tipomoneda instance = new Tipomoneda();
        String expResult = "";
        String result = instance.getCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModified method, of class Tipomoneda.
     */
    @Test
    public void testGetModified() {
        System.out.println("getModified");
        Tipomoneda instance = new Tipomoneda();
        String expResult = "";
        String result = instance.getModified();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdtipmon method, of class Tipomoneda.
     */
    @Test
    public void testSetIdtipmon() {
        System.out.println("setIdtipmon");
        int idtipmon = 0;
        Tipomoneda instance = new Tipomoneda();
        instance.setIdtipmon(idtipmon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Tipomoneda.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Tipomoneda instance = new Tipomoneda();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSimbol method, of class Tipomoneda.
     */
    @Test
    public void testSetSimbol() {
        System.out.println("setSimbol");
        String simbol = "";
        Tipomoneda instance = new Tipomoneda();
        instance.setSimbol(simbol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPor_defecto method, of class Tipomoneda.
     */
    @Test
    public void testSetPor_defecto() {
        System.out.println("setPor_defecto");
        boolean por_defecto = false;
        Tipomoneda instance = new Tipomoneda();
        instance.setPor_defecto(por_defecto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreated method, of class Tipomoneda.
     */
    @Test
    public void testSetCreated() {
        System.out.println("setCreated");
        String created = "";
        Tipomoneda instance = new Tipomoneda();
        instance.setCreated(created);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModified method, of class Tipomoneda.
     */
    @Test
    public void testSetModified() {
        System.out.println("setModified");
        String modified = "";
        Tipomoneda instance = new Tipomoneda();
        instance.setModified(modified);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

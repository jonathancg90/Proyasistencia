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
public class HorariosTest {
    
    public HorariosTest() {
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
     * Test of getIdhora method, of class Horarios.
     */
    @Test
    public void testGetIdhora() {
        System.out.println("getIdhora");
        Horarios instance = new Horarios();
        int expResult = 0;
        int result = instance.getIdhora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdhora method, of class Horarios.
     */
    @Test
    public void testSetIdhora() {
        System.out.println("setIdhora");
        int idhora = 0;
        Horarios instance = new Horarios();
        instance.setIdhora(idhora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Horarios.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Horarios instance = new Horarios();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Horarios.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Horarios instance = new Horarios();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Horarios.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Horarios instance = new Horarios();
        int expResult = 0;
        int result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Horarios.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        int tipo = 0;
        Horarios instance = new Horarios();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstado method, of class Horarios.
     */
    @Test
    public void testIsEstado() {
        System.out.println("isEstado");
        Horarios instance = new Horarios();
        boolean expResult = false;
        boolean result = instance.isEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Horarios.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        boolean estado = false;
        Horarios instance = new Horarios();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreated method, of class Horarios.
     */
    @Test
    public void testGetCreated() {
        System.out.println("getCreated");
        Horarios instance = new Horarios();
        String expResult = "";
        String result = instance.getCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreated method, of class Horarios.
     */
    @Test
    public void testSetCreated() {
        System.out.println("setCreated");
        String created = "";
        Horarios instance = new Horarios();
        instance.setCreated(created);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModified method, of class Horarios.
     */
    @Test
    public void testGetModified() {
        System.out.println("getModified");
        Horarios instance = new Horarios();
        String expResult = "";
        String result = instance.getModified();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModified method, of class Horarios.
     */
    @Test
    public void testSetModified() {
        System.out.println("setModified");
        String modified = "";
        Horarios instance = new Horarios();
        instance.setModified(modified);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

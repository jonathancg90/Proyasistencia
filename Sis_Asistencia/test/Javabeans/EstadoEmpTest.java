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
public class EstadoEmpTest {
    
    public EstadoEmpTest() {
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
     * Test of getIdest method, of class EstadoEmp.
     */
    @Test
    public void testGetIdest() {
        System.out.println("getIdest");
        EstadoEmp instance = new EstadoEmp();
        int expResult = 0;
        int result = instance.getIdest();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class EstadoEmp.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        EstadoEmp instance = new EstadoEmp();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdest method, of class EstadoEmp.
     */
    @Test
    public void testSetIdest() {
        System.out.println("setIdest");
        int idest = 0;
        EstadoEmp instance = new EstadoEmp();
        instance.setIdest(idest);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class EstadoEmp.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        EstadoEmp instance = new EstadoEmp();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

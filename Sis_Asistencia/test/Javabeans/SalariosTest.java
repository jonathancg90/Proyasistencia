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
public class SalariosTest {
    
    public SalariosTest() {
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
     * Test of getIdsalario method, of class Salarios.
     */
    @Test
    public void testGetIdsalario() {
        System.out.println("getIdsalario");
        Salarios instance = new Salarios();
        int expResult = 0;
        int result = instance.getIdsalario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdsalario method, of class Salarios.
     */
    @Test
    public void testSetIdsalario() {
        System.out.println("setIdsalario");
        int idsalario = 0;
        Salarios instance = new Salarios();
        instance.setIdsalario(idsalario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdemp method, of class Salarios.
     */
    @Test
    public void testGetIdemp() {
        System.out.println("getIdemp");
        Salarios instance = new Salarios();
        int expResult = 0;
        int result = instance.getIdemp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdemp method, of class Salarios.
     */
    @Test
    public void testSetIdemp() {
        System.out.println("setIdemp");
        int idemp = 0;
        Salarios instance = new Salarios();
        instance.setIdemp(idemp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getF_inicio method, of class Salarios.
     */
    @Test
    public void testGetF_inicio() {
        System.out.println("getF_inicio");
        Salarios instance = new Salarios();
        String expResult = "";
        String result = instance.getF_inicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setF_inicio method, of class Salarios.
     */
    @Test
    public void testSetF_inicio() {
        System.out.println("setF_inicio");
        String f_inicio = "";
        Salarios instance = new Salarios();
        instance.setF_inicio(f_inicio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getF_final method, of class Salarios.
     */
    @Test
    public void testGetF_final() {
        System.out.println("getF_final");
        Salarios instance = new Salarios();
        String expResult = "";
        String result = instance.getF_final();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setF_final method, of class Salarios.
     */
    @Test
    public void testSetF_final() {
        System.out.println("setF_final");
        String f_final = "";
        Salarios instance = new Salarios();
        instance.setF_final(f_final);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPor_defecto method, of class Salarios.
     */
    @Test
    public void testIsPor_defecto() {
        System.out.println("isPor_defecto");
        Salarios instance = new Salarios();
        boolean expResult = false;
        boolean result = instance.isPor_defecto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPor_defecto method, of class Salarios.
     */
    @Test
    public void testSetPor_defecto() {
        System.out.println("setPor_defecto");
        boolean por_defecto = false;
        Salarios instance = new Salarios();
        instance.setPor_defecto(por_defecto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreated method, of class Salarios.
     */
    @Test
    public void testGetCreated() {
        System.out.println("getCreated");
        Salarios instance = new Salarios();
        String expResult = "";
        String result = instance.getCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreated method, of class Salarios.
     */
    @Test
    public void testSetCreated() {
        System.out.println("setCreated");
        String created = "";
        Salarios instance = new Salarios();
        instance.setCreated(created);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModified method, of class Salarios.
     */
    @Test
    public void testGetModified() {
        System.out.println("getModified");
        Salarios instance = new Salarios();
        String expResult = "";
        String result = instance.getModified();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModified method, of class Salarios.
     */
    @Test
    public void testSetModified() {
        System.out.println("setModified");
        String modified = "";
        Salarios instance = new Salarios();
        instance.setModified(modified);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonto method, of class Salarios.
     */
    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        Salarios instance = new Salarios();
        double expResult = 0.0;
        double result = instance.getMonto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMonto method, of class Salarios.
     */
    @Test
    public void testSetMonto() {
        System.out.println("setMonto");
        double monto = 0.0;
        Salarios instance = new Salarios();
        instance.setMonto(monto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

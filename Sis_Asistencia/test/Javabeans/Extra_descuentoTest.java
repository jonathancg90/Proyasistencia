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
public class Extra_descuentoTest {
    
    public Extra_descuentoTest() {
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
     * Test of getId method, of class Extra_descuento.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Extra_descuento instance = new Extra_descuento();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Extra_descuento.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Extra_descuento instance = new Extra_descuento();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Extra_descuento.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Extra_descuento instance = new Extra_descuento();
        int expResult = 0;
        int result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Extra_descuento.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        int tipo = 0;
        Extra_descuento instance = new Extra_descuento();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Extra_descuento.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Extra_descuento instance = new Extra_descuento();
        String expResult = "";
        String result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Extra_descuento.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "";
        Extra_descuento instance = new Extra_descuento();
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonto method, of class Extra_descuento.
     */
    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        Extra_descuento instance = new Extra_descuento();
        float expResult = 0.0F;
        float result = instance.getMonto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMonto method, of class Extra_descuento.
     */
    @Test
    public void testSetMonto() {
        System.out.println("setMonto");
        float monto = 0.0F;
        Extra_descuento instance = new Extra_descuento();
        instance.setMonto(monto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdemp method, of class Extra_descuento.
     */
    @Test
    public void testGetIdemp() {
        System.out.println("getIdemp");
        Extra_descuento instance = new Extra_descuento();
        int expResult = 0;
        int result = instance.getIdemp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdemp method, of class Extra_descuento.
     */
    @Test
    public void testSetIdemp() {
        System.out.println("setIdemp");
        int idemp = 0;
        Extra_descuento instance = new Extra_descuento();
        instance.setIdemp(idemp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

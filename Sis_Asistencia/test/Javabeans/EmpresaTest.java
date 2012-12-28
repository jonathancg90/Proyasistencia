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
public class EmpresaTest {
    
    public EmpresaTest() {
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
     * Test of getIdempr method, of class Empresa.
     */
    @Test
    public void testGetIdempr() {
        System.out.println("getIdempr");
        Empresa instance = new Empresa();
        int expResult = 0;
        int result = instance.getIdempr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdempr method, of class Empresa.
     */
    @Test
    public void testSetIdempr() {
        System.out.println("setIdempr");
        int idempr = 0;
        Empresa instance = new Empresa();
        instance.setIdempr(idempr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Empresa.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Empresa instance = new Empresa();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Empresa.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Empresa instance = new Empresa();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRuc method, of class Empresa.
     */
    @Test
    public void testGetRuc() {
        System.out.println("getRuc");
        Empresa instance = new Empresa();
        String expResult = "";
        String result = instance.getRuc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRuc method, of class Empresa.
     */
    @Test
    public void testSetRuc() {
        System.out.println("setRuc");
        String ruc = "";
        Empresa instance = new Empresa();
        instance.setRuc(ruc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstado method, of class Empresa.
     */
    @Test
    public void testIsEstado() {
        System.out.println("isEstado");
        Empresa instance = new Empresa();
        boolean expResult = false;
        boolean result = instance.isEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Empresa.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        boolean estado = false;
        Empresa instance = new Empresa();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTrabajadores method, of class Empresa.
     */
    @Test
    public void testSetTrabajadores() {
        System.out.println("setTrabajadores");
        int trabajadores = 0;
        Empresa instance = new Empresa();
        instance.setTrabajadores(trabajadores);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMon method, of class Empresa.
     */
    @Test
    public void testSetMon() {
        System.out.println("setMon");
        int mon = 0;
        Empresa instance = new Empresa();
        instance.setMon(mon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreated method, of class Empresa.
     */
    @Test
    public void testGetCreated() {
        System.out.println("getCreated");
        Empresa instance = new Empresa();
        String expResult = "";
        String result = instance.getCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreated method, of class Empresa.
     */
    @Test
    public void testSetCreated() {
        System.out.println("setCreated");
        String created = "";
        Empresa instance = new Empresa();
        instance.setCreated(created);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModified method, of class Empresa.
     */
    @Test
    public void testGetModified() {
        System.out.println("getModified");
        Empresa instance = new Empresa();
        String expResult = "";
        String result = instance.getModified();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrabajadores method, of class Empresa.
     */
    @Test
    public void testGetTrabajadores() {
        System.out.println("getTrabajadores");
        Empresa instance = new Empresa();
        int expResult = 0;
        int result = instance.getTrabajadores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMon method, of class Empresa.
     */
    @Test
    public void testGetMon() {
        System.out.println("getMon");
        Empresa instance = new Empresa();
        int expResult = 0;
        int result = instance.getMon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModified method, of class Empresa.
     */
    @Test
    public void testSetModified() {
        System.out.println("setModified");
        String modified = "";
        Empresa instance = new Empresa();
        instance.setModified(modified);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

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
public class ValidatorsTest {
    
    public ValidatorsTest() {
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
     * Test of formValidate method, of class Validators.
     */
    @Test
    public void testFormValidate() {
        System.out.println("formValidate");
        Validators instance = new Validators();
        boolean expResult = false;
        boolean result = instance.formValidate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EntryForms method, of class Validators.
     */
    @Test
    public void testEntryForms() {
        System.out.println("EntryForms");
        Validators instance = new Validators();
        boolean expResult = false;
        boolean result = instance.EntryForms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restrictAcces method, of class Validators.
     */
    @Test
    public void testRestrictAcces() {
        System.out.println("restrictAcces");
        Validators instance = new Validators();
        boolean expResult = false;
        boolean result = instance.restrictAcces();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of StringToBoolean method, of class Validators.
     */
    @Test
    public void testStringToBoolean() {
        System.out.println("StringToBoolean");
        String value = "";
        Validators instance = new Validators();
        boolean expResult = false;
        boolean result = instance.StringToBoolean(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validar method, of class Validators.
     */
    @Test
    public void testValidar() {
        System.out.println("validar");
        Object[] datos = null;
        Validators instance = new Validators();
        boolean expResult = false;
        //boolean result = instance.validar(datos);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

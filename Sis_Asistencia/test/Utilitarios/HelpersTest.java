/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import java.io.File;
import javax.swing.JTable;
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
public class HelpersTest {
    
    public HelpersTest() {
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
     * Test of readFiles method, of class Helpers.
     */
    @Test
    public void testReadFiles() throws Exception {
        System.out.println("readFiles");
        File lectura = null;
        Helpers instance = new Helpers();
        String expResult = "";
        String result = instance.readFiles(lectura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateNow method, of class Helpers.
     */
    @Test
    public void testGetDateNow() {
        System.out.println("getDateNow");
        Helpers instance = new Helpers();
        String expResult = "";
        String result = instance.getDateNow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWidthJtable method, of class Helpers.
     */
    @Test
    public void testSetWidthJtable() {
        System.out.println("setWidthJtable");
        JTable tblDatos = null;
        int[] args = null;
        Helpers instance = new Helpers();
        instance.setWidthJtable(tblDatos, args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

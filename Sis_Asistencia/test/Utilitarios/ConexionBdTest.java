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
public class ConexionBdTest {
    
    public ConexionBdTest() {
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
     * Test of main method, of class ConexionBd.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        ConexionBd.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConexion method, of class ConexionBd.
     */
    @Test
    public void testGetConexion() throws Exception {
        System.out.println("getConexion");
        ConexionBd instance = new ConexionBd();
        instance.getConexion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeConexion method, of class ConexionBd.
     */
    @Test
    public void testCloseConexion() {
        System.out.println("closeConexion");
        ConexionBd instance = new ConexionBd();
        instance.closeConexion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

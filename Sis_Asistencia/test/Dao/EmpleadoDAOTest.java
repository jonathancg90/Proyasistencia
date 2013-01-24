/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Javabeans.Empleado;
import javax.swing.JLabel;
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
public class EmpleadoDAOTest {
    
    public EmpleadoDAOTest() {
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
     * Test of getTableAll method, of class EmpleadoDAO.
     */
    @Test
    public void testGetTableAll() {
        System.out.println("getTableAll");
        JTable tblDatos = null;
        JLabel lblcant = null;
        EmpleadoDAO instance = new EmpleadoDAO();
        instance.getTableAll(tblDatos, lblcant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveEmpleado method, of class EmpleadoDAO.
     */
    @Test
    public void testSaveEmpleado() {
        System.out.println("saveEmpleado");
        int idemp = 0;
        String nombres = "";
        String apellidos = "";
        String dni = "";
        String telefono = "";
        int idare = 0;
        int idtip = 0;
        int idest = 0;
        int idcar = 0;
        int idempr = 0;
        int idsuc = 0;
        EmpleadoDAO instance = new EmpleadoDAO();
        int expResult = 0;
        int result = instance.saveEmpleado(idemp, nombres, apellidos, dni, telefono, idare, idtip, idest, idcar, idempr, idsuc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateEmpresa method, of class EmpleadoDAO.
     */
    @Test
    public void testUpdateEmpresa() {
        System.out.println("UpdateEmpresa");
        int empresa = 0;
        EmpleadoDAO instance = new EmpleadoDAO();
        int expResult = 0;
        int result = instance.UpdateEmpresa(empresa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEmpleado method, of class EmpleadoDAO.
     */
    @Test
    public void testUpdateEmpleado() {
        System.out.println("updateEmpleado");
        int idemp = 0;
        String nombres = "";
        String apellidos = "";
        String dni = "";
        String telefono = "";
        int idare = 0;
        int idtip = 0;
        int idest = 0;
        int idcar = 0;
        int idempr = 0;
        int idsuc = 0;
        EmpleadoDAO instance = new EmpleadoDAO();
        int expResult = 0;
        int result = instance.updateEmpleado(idemp, nombres, apellidos, dni, telefono, idare, idtip, idest, idcar, idempr, idsuc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteEmpleado method, of class EmpleadoDAO.
     */
    @Test
    public void testDeleteEmpleado() {
        System.out.println("deleteEmpleado");
        int idemp = 0;
        EmpleadoDAO instance = new EmpleadoDAO();
        int expResult = 0;
        int result = instance.deleteEmpleado(idemp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class EmpleadoDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String idareaactivo = "";
        JTable tblDatos = null;
        JLabel lblcant = null;
        EmpleadoDAO instance = new EmpleadoDAO();
        int expResult = 0;
        int result = instance.find(idareaactivo, tblDatos, lblcant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValues method, of class EmpleadoDAO.
     */
    @Test
    public void testGetValues() {
        System.out.println("getValues");
        int idemp = 0;
        EmpleadoDAO instance = new EmpleadoDAO();
        Empleado expResult = null;
        Empleado result = instance.getValues(idemp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Javabeans.Empresa;
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
public class EmpresaDAOTest {
    
    public EmpresaDAOTest() {
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
     * Test of getTableAll method, of class EmpresaDAO.
     */
    @Test
    public void testGetTableAll() {
        System.out.println("getTableAll");
        JTable tblDatos = null;
        JLabel lblcant = null;
        EmpresaDAO instance = new EmpresaDAO();
        instance.getTableAll(tblDatos, lblcant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class EmpresaDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String name = "";
        String ruc = "";
        boolean statem = false;
        int trabajadores = 0;
        int mon = 0;
        EmpresaDAO instance = new EmpresaDAO();
        int expResult = 0;
        int result = instance.save(name, ruc, statem, trabajadores, mon);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class EmpresaDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int id = 0;
        String name = "";
        String ruc = "";
        boolean state = false;
        int trabajadores = 0;
        int mon = 0;
        EmpresaDAO instance = new EmpresaDAO();
        int expResult = 0;
        int result = instance.update(id, name, ruc, state, trabajadores, mon);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class EmpresaDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        EmpresaDAO instance = new EmpresaDAO();
        int expResult = 0;
        int result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class EmpresaDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String name = "";
        JTable tblDatos = null;
        JLabel lblcant = null;
        EmpresaDAO instance = new EmpresaDAO();
        int expResult = 0;
        int result = instance.find(name, tblDatos, lblcant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValues method, of class EmpresaDAO.
     */
    @Test
    public void testGetValues() {
        System.out.println("getValues");
        int idemp = 0;
        EmpresaDAO instance = new EmpresaDAO();
        Empresa expResult = null;
        Empresa result = instance.getValues(idemp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

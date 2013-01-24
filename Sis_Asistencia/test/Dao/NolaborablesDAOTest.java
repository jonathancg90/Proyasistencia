/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Javabeans.Nolaborables;
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
public class NolaborablesDAOTest {
    
    public NolaborablesDAOTest() {
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
     * Test of getTableAll method, of class NolaborablesDAO.
     */
    @Test
    public void testGetTableAll() {
        System.out.println("getTableAll");
        JTable tblDatos = null;
        JLabel lblcant = null;
        NolaborablesDAO instance = new NolaborablesDAO();
        instance.getTableAll(tblDatos, lblcant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class NolaborablesDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String fecha = "";
        boolean status = false;
        int idempr = 0;
        NolaborablesDAO instance = new NolaborablesDAO();
        int expResult = 0;
        int result = instance.save(fecha, status, idempr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class NolaborablesDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int idnolaborables = 0;
        String fecha = "";
        boolean status = false;
        int idempr = 0;
        NolaborablesDAO instance = new NolaborablesDAO();
        int expResult = 0;
        int result = instance.update(idnolaborables, fecha, status, idempr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValues method, of class NolaborablesDAO.
     */
    @Test
    public void testGetValues() {
        System.out.println("getValues");
        int idnolaborables = 0;
        NolaborablesDAO instance = new NolaborablesDAO();
        Nolaborables expResult = null;
        Nolaborables result = instance.getValues(idnolaborables);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class NolaborablesDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        NolaborablesDAO instance = new NolaborablesDAO();
        int expResult = 0;
        int result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findId method, of class NolaborablesDAO.
     */
    @Test
    public void testFindId() {
        System.out.println("findId");
        String id = "";
        JTable tblDatos = null;
        JLabel lblcant = null;
        NolaborablesDAO instance = new NolaborablesDAO();
        int expResult = 0;
        int result = instance.findId(id, tblDatos, lblcant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

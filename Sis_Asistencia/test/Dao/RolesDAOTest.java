/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Javabeans.Roles;
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
public class RolesDAOTest {
    
    public RolesDAOTest() {
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
     * Test of getTableAll method, of class RolesDAO.
     */
    @Test
    public void testGetTableAll() {
        System.out.println("getTableAll");
        JTable tblDatos = null;
        JLabel lblcant = null;
        RolesDAO instance = new RolesDAO();
        instance.getTableAll(tblDatos, lblcant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class RolesDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String name = "";
        RolesDAO instance = new RolesDAO();
        int expResult = 0;
        int result = instance.save(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class RolesDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int id = 0;
        String name = "";
        RolesDAO instance = new RolesDAO();
        int expResult = 0;
        int result = instance.update(id, name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class RolesDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        RolesDAO instance = new RolesDAO();
        int expResult = 0;
        int result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class RolesDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String name = "";
        JTable tblDatos = null;
        JLabel lblcant = null;
        RolesDAO instance = new RolesDAO();
        int expResult = 0;
        int result = instance.find(name, tblDatos, lblcant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValues method, of class RolesDAO.
     */
    @Test
    public void testGetValues() {
        System.out.println("getValues");
        int idrol = 0;
        RolesDAO instance = new RolesDAO();
        Roles expResult = null;
        Roles result = instance.getValues(idrol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

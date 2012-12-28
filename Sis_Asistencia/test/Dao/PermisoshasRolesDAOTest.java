/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

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
public class PermisoshasRolesDAOTest {
    
    public PermisoshasRolesDAOTest() {
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
     * Test of getTableAll method, of class PermisoshasRolesDAO.
     */
    @Test
    public void testGetTableAll() {
        System.out.println("getTableAll");
        JTable tblDatos = null;
        PermisoshasRolesDAO instance = new PermisoshasRolesDAO();
        instance.getTableAll(tblDatos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class PermisoshasRolesDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        int rol = 0;
        int modulo = 0;
        PermisoshasRolesDAO instance = new PermisoshasRolesDAO();
        int expResult = 0;
        int result = instance.save(rol, modulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class PermisoshasRolesDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int rol = 0;
        int modulo = 0;
        PermisoshasRolesDAO instance = new PermisoshasRolesDAO();
        int expResult = 0;
        int result = instance.delete(rol, modulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

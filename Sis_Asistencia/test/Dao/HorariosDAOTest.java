/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Javabeans.Horarios;
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
public class HorariosDAOTest {
    
    public HorariosDAOTest() {
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
     * Test of getTableAll method, of class HorariosDAO.
     */
    @Test
    public void testGetTableAll() {
        System.out.println("getTableAll");
        JTable tblDatos = null;
        HorariosDAO instance = new HorariosDAO();
        instance.getTableAll(tblDatos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class HorariosDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String name = "";
        boolean state = false;
        int tipo = 0;
        HorariosDAO instance = new HorariosDAO();
        int expResult = 0;
        int result = instance.save(name, state, tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class HorariosDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int id = 0;
        String name = "";
        int tipo = 0;
        boolean state = false;
        HorariosDAO instance = new HorariosDAO();
        int expResult = 0;
        int result = instance.update(id, name, tipo, state);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class HorariosDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        HorariosDAO instance = new HorariosDAO();
        int expResult = 0;
        int result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class HorariosDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String state = "";
        JTable tblDatos = null;
        HorariosDAO instance = new HorariosDAO();
        int expResult = 0;
        int result = instance.find(state, tblDatos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValues method, of class HorariosDAO.
     */
    @Test
    public void testGetValues() {
        System.out.println("getValues");
        int idusu = 0;
        HorariosDAO instance = new HorariosDAO();
        Horarios expResult = null;
        Horarios result = instance.getValues(idusu);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

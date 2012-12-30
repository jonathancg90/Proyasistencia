/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Javabeans.Empleado_has_horarios;
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
public class Empleado_has_horariosDAOTest {
    
    public Empleado_has_horariosDAOTest() {
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
     * Test of getTableAll method, of class Empleado_has_horariosDAO.
     */
    @Test
    public void testGetTableAll() {
        System.out.println("getTableAll");
        JTable tblDatos = null;
        Empleado_has_horariosDAO instance = new Empleado_has_horariosDAO();
        instance.getTableAll(tblDatos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class Empleado_has_horariosDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String f_inicio = "";
        String f_final = "";
        int idhor = 0;
        int idemp = 0;
        Empleado_has_horariosDAO instance = new Empleado_has_horariosDAO();
        int expResult = 0;
        int result = instance.save(f_inicio, f_final, idhor, idemp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Empleado_has_horariosDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int NMID = 0;
        String f_inicio = "";
        String f_final = "";
        int idhor = 0;
        int idemp = 0;
        Empleado_has_horariosDAO instance = new Empleado_has_horariosDAO();
        int expResult = 0;
        int result = instance.update(NMID, f_inicio, f_final, idhor, idemp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValues method, of class Empleado_has_horariosDAO.
     */
    @Test
    public void testGetValues() {
        System.out.println("getValues");
        int NMID = 0;
        Empleado_has_horariosDAO instance = new Empleado_has_horariosDAO();
        Empleado_has_horarios expResult = null;
        Empleado_has_horarios result = instance.getValues(NMID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Empleado_has_horariosDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int NMID = 0;
        Empleado_has_horariosDAO instance = new Empleado_has_horariosDAO();
        int expResult = 0;
        int result = instance.delete(NMID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findId method, of class Empleado_has_horariosDAO.
     */
    @Test
    public void testFindId() {
        System.out.println("findId");
        String id = "";
        JTable tblDatos = null;
        Empleado_has_horariosDAO instance = new Empleado_has_horariosDAO();
        int expResult = 0;
        int result = instance.findId(id, tblDatos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

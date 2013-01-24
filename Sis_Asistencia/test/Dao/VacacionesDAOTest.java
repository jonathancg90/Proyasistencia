/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Javabeans.Vacaciones;
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
public class VacacionesDAOTest {
    
    public VacacionesDAOTest() {
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
     * Test of getTableAll method, of class VacacionesDAO.
     */
    @Test
    public void testGetTableAll() {
        System.out.println("getTableAll");
        JTable tblDatos = null;
        JLabel lblcant = null;
        VacacionesDAO instance = new VacacionesDAO();
        instance.getTableAll(tblDatos, lblcant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class VacacionesDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String f_inicio = "";
        String f_final = "";
        int idemp = 0;
        VacacionesDAO instance = new VacacionesDAO();
        int expResult = 0;
        int result = instance.save(f_inicio, f_final, idemp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class VacacionesDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int idsalario = 0;
        String f_inicio = "";
        String f_final = "";
        int idemp = 0;
        VacacionesDAO instance = new VacacionesDAO();
        int expResult = 0;
        int result = instance.update(idsalario, f_inicio, f_final, idemp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValues method, of class VacacionesDAO.
     */
    @Test
    public void testGetValues() {
        System.out.println("getValues");
        int idVacaciones = 0;
        VacacionesDAO instance = new VacacionesDAO();
        Vacaciones expResult = null;
        Vacaciones result = instance.getValues(idVacaciones);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class VacacionesDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        VacacionesDAO instance = new VacacionesDAO();
        int expResult = 0;
        int result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findId method, of class VacacionesDAO.
     */
    @Test
    public void testFindId() {
        System.out.println("findId");
        String id = "";
        JTable tblDatos = null;
        JLabel lblcant = null;
        VacacionesDAO instance = new VacacionesDAO();
        int expResult = 0;
        int result = instance.findId(id, tblDatos, lblcant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

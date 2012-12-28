/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Javabeans.Salarios;
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
public class SalariosDAOTest {
    
    public SalariosDAOTest() {
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
     * Test of getTableAll method, of class SalariosDAO.
     */
    @Test
    public void testGetTableAll() {
        System.out.println("getTableAll");
        JTable tblDatos = null;
        SalariosDAO instance = new SalariosDAO();
        instance.getTableAll(tblDatos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class SalariosDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String f_inicio = "";
        String f_final = "";
        boolean por_defecto = false;
        int idemp = 0;
        double monto = 0.0;
        SalariosDAO instance = new SalariosDAO();
        int expResult = 0;
        int result = instance.save(f_inicio, f_final, por_defecto, idemp, monto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class SalariosDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int idsalario = 0;
        String f_inicio = "";
        String f_final = "";
        boolean por_defecto = false;
        int idemp = 0;
        double monto = 0.0;
        SalariosDAO instance = new SalariosDAO();
        int expResult = 0;
        int result = instance.update(idsalario, f_inicio, f_final, por_defecto, idemp, monto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValues method, of class SalariosDAO.
     */
    @Test
    public void testGetValues() {
        System.out.println("getValues");
        int idSalarios = 0;
        SalariosDAO instance = new SalariosDAO();
        Salarios expResult = null;
        Salarios result = instance.getValues(idSalarios);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class SalariosDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        SalariosDAO instance = new SalariosDAO();
        int expResult = 0;
        int result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findId method, of class SalariosDAO.
     */
    @Test
    public void testFindId() {
        System.out.println("findId");
        String id = "";
        JTable tblDatos = null;
        SalariosDAO instance = new SalariosDAO();
        int expResult = 0;
        int result = instance.findId(id, tblDatos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

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
public class DetailHorarioDAOTest {
    
    public DetailHorarioDAOTest() {
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
     * Test of getTableAll method, of class DetailHorarioDAO.
     */
    @Test
    public void testGetTableAll() {
        System.out.println("getTableAll");
        JTable tblDatos = null;
        DetailHorarioDAO instance = new DetailHorarioDAO();
        instance.getTableAll(tblDatos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class DetailHorarioDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        int dia = 0;
        int idtip_reg = 0;
        String ingreso = "";
        String salida = "";
        int horario = 0;
        DetailHorarioDAO instance = new DetailHorarioDAO();
        int expResult = 0;
        int result = instance.save(dia, idtip_reg, ingreso, salida, horario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DetailHorarioDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        DetailHorarioDAO instance = new DetailHorarioDAO();
        int expResult = 0;
        int result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class DetailHorarioDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String name = "";
        JTable tblDatos = null;
        DetailHorarioDAO instance = new DetailHorarioDAO();
        int expResult = 0;
        int result = instance.find(name, tblDatos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

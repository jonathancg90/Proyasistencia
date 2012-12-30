/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Javabeans.Sucursal;
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
public class SucursalDaoTest {
    
    public SucursalDaoTest() {
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
     * Test of getTableAll method, of class SucursalDao.
     */
    @Test
    public void testGetTableAll() {
        System.out.println("getTableAll");
        JTable tblDatos = null;
        SucursalDao instance = new SucursalDao();
        instance.getTableAll(tblDatos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class SucursalDao.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String name = "";
        String direccion = "";
        int idciu = 0;
        int idempr = 0;
        SucursalDao instance = new SucursalDao();
        int expResult = 0;
        int result = instance.save(name, direccion, idciu, idempr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class SucursalDao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int id = 0;
        String name = "";
        String direccion = "";
        int idciu = 0;
        int idempr = 0;
        SucursalDao instance = new SucursalDao();
        int expResult = 0;
        int result = instance.update(id, name, direccion, idciu, idempr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class SucursalDao.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        SucursalDao instance = new SucursalDao();
        int expResult = 0;
        int result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findName method, of class SucursalDao.
     */
    @Test
    public void testFindName() {
        System.out.println("findName");
        String name = "";
        String id = "";
        JTable tblDatos = null;
        SucursalDao instance = new SucursalDao();
        int expResult = 0;
        int result = instance.findName(name, id, tblDatos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findId method, of class SucursalDao.
     */
    @Test
    public void testFindId() {
        System.out.println("findId");
        String id = "";
        JTable tblDatos = null;
        SucursalDao instance = new SucursalDao();
        int expResult = 0;
        int result = instance.findId(id, tblDatos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValues method, of class SucursalDao.
     */
    @Test
    public void testGetValues() {
        System.out.println("getValues");
        int idusu = 0;
        SucursalDao instance = new SucursalDao();
        Sucursal expResult = null;
        Sucursal result = instance.getValues(idusu);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

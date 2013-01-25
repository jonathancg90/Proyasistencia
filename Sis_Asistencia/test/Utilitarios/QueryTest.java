/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import java.sql.PreparedStatement;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
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
public class QueryTest {
    
    public QueryTest() {
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
     * Test of setIdentify method, of class Query.
     */
    @Test
    public void testSetIdentify() {
        System.out.println("setIdentify");
        String identify = "";
        Query instance = new Query();
        instance.setIdentify(identify);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sqlRegister method, of class Query.
     */
    @Test
    public void testSqlRegister() {
        System.out.println("sqlRegister");
        String Table = "";
        Query instance = new Query();
        PreparedStatement expResult = null;
        PreparedStatement result = instance.sqlRegister(Table);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sqlSearch method, of class Query.
     */
    @Test
    public void testSqlSearch() {
        System.out.println("sqlSearch");
        Query instance = new Query();
        String expResult = "";
        //String result = instance.sqlSearch();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sqlUpdate method, of class Query.
     */
    @Test
    public void testSqlUpdate() {
        System.out.println("sqlUpdate");
        String Table = "";
        Query instance = new Query();
        PreparedStatement expResult = null;
        PreparedStatement result = instance.sqlUpdate(Table);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sqlDelete method, of class Query.
     */
    @Test
    public void testSqlDelete() {
        System.out.println("sqlDelete");
        String Table = "";
        Query instance = new Query();
        PreparedStatement expResult = null;
        PreparedStatement result = instance.sqlDelete(Table);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQueryList method, of class Query.
     */
    @Test
    public void testGetQueryList() {
        System.out.println("getQueryList");
        String[] args = null;
        String Table = "";
        String[][] Filter = null;
        Query instance = new Query();
        String expResult = "";
        String result = instance.getQueryList(args, Table, Filter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class Query.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        String[] args = null;
        String Table = "";
        String[][] Filter = null;
        Query instance = new Query();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.getAll(args, Table, Filter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadState method, of class Query.
     */
    @Test
    public void testLoadState() {
        System.out.println("loadState");
        JComboBox cmbState = null;
        boolean value = false;
        Query instance = new Query();
        instance.loadState(cmbState, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadGlobal method, of class Query.
     */
    @Test
    public void testLoadGlobal() {
        System.out.println("loadGlobal");
        int op = 0;
        JComboBox cmbType = null;
        int value = 0;
        Query instance = new Query();
        int expResult = 0;
        int result = instance.loadGlobal(op, cmbType, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadChoice method, of class Query.
     */
    @Test
    public void testLoadChoice() {
        System.out.println("loadChoice");
        JComboBox cmbChoice = null;
        String Tbl = "";
        String Campo = "";
        Query instance = new Query();
        instance.loadChoice(cmbChoice, Tbl, Campo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadChoiceDefault method, of class Query.
     */
    @Test
    public void testLoadChoiceDefault() {
        System.out.println("loadChoiceDefault");
        JComboBox cmbChoice = null;
        String Tbl = "";
        String Campo = "";
        int value = 0;
        Query instance = new Query();
        instance.loadChoiceDefault(cmbChoice, Tbl, Campo, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of idChoice method, of class Query.
     */
    @Test
    public void testIdChoice() {
        System.out.println("idChoice");
        String Tbl = "";
        String Campo = "";
        String value = "";
        Query instance = new Query();
        int expResult = 0;
        //int result = instance.idChoice(Tbl, Campo, value);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecords method, of class Query.
     */
    @Test
    public void testGetRecords() {
        System.out.println("getRecords");
        String Table = "";
        int Id = 0;
        Query instance = new Query();
        String[] expResult = null;
        String[] result = instance.getRecords(Table, Id);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCountRegister method, of class Query.
     */
    @Test
    public void testGetCountRegister() {
        System.out.println("getCountRegister");
        String[] args = null;
        Query instance = new Query();
        int expResult = 0;
        int result = instance.getCountRegister(args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

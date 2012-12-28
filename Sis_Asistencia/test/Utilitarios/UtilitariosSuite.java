/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author platano
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Utilitarios.ConexionBdTest.class, Utilitarios.ConfigTest.class, Utilitarios.ValidatorsTest.class, Utilitarios.QueryTest.class, Utilitarios.HelpersTest.class, Utilitarios.DataTest.class})
public class UtilitariosSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}

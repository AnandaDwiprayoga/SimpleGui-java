/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 *
 * @author PC
 */
public class UserTest extends TestCase{
     static User  instance;
    
    public UserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new User(1831710119, "1831710119");
        System.out.format("Start testing : %s \n", this.getName());
    }
    
    @After
    public void tearDown() {
        System.out.format("Finish test %s\n", this.getName());
    }


    @Test
    public void testLogin() {
        System.out.println("login test");
        boolean expResult = true;
        boolean result = instance.login();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /** 
     * Test of getUserLogin method, of class User.
     */
    @Test
    public void testGetUserLogin() {
        System.out.println("getUserLogin test");
        User expResult = new User();
        expResult.setNim(1831710119);
        expResult.setNama("Ananda dwi prayoga");
        expResult.setPassword("1831710119");
        expResult.setAlamat("Desa mojoarum kecamatan gondang");
        expResult.getUserLogin();
        
        User result = instance.getUserLogin();
        assertEquals(expResult.getNama(), result.getNama());
        assertEquals(expResult.getAlamat(), result.getAlamat());
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

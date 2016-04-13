/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class RandomClassTest {
     static long czas;
    public RandomClassTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
        System.out.println(System.currentTimeMillis()-czas+" milisekund");
    }
    
    @Test
    public void testLosuj() {
        RandomClass.losuj();
        assertEquals(10, RandomClass.multiple2(5));
        
    }
 
}

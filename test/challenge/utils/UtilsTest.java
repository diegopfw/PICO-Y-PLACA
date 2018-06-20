/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge.utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diego
 */
public class UtilsTest {
    
    public UtilsTest() {
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
     * Test of isNumber method, of class Utils.
     */
    @Test
    public void testIsNumber() {
        System.out.println("isNumber");
        String value = "2";
        boolean expResult = Boolean.TRUE;
        boolean result = Utils.isNumber(value);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of isEmpty method, of class Utils.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        String value = "";
        Boolean expResult = Boolean.TRUE;
        Boolean result = Utils.isEmpty(value);
        assertEquals(expResult, result);
    }

    /**
     * Test of getWeekDayNumberFromDate method, of class Utils.
     */
    @Test
    public void testGetWeekDayNumberFromDate() {
        System.out.println("getWeekDayNumberFromDate");
        String dt = Constants.DATE;
        Integer expResult = 2;
        Integer result = Utils.getWeekDayNumberFromDate(dt);
        assertEquals(expResult, result);
    }

    /**
     * Test of isValidDate method, of class Utils.
     */
    @Test
    public void testIsValidDate() {
        System.out.println("isValidDate");
        String inDate = Constants.DATE;
        boolean expResult = true;
        boolean result = Utils.isValidDate(inDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isBetween method, of class Utils.
     */
    @Test
    public void testIsBetween() {
        String fieldHour = Constants.FIELD_HOUR;
        String initHour = Constants.INIT_HOUR;
        String endHour = Constants.END_HOUR;
        boolean expResult = true;
        boolean result = Utils.isBetween(fieldHour, initHour, endHour);
        assertEquals(expResult, result);
    }
    
}

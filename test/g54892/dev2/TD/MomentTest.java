/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54892.dev2.TD;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Yassin
 */
public class MomentTest {
    
    public MomentTest() {
    }

    /**
     * Test of getHour method, of class Moment.
     */
    @Test
    public void testGetHour() {
        System.out.println("getHour");
        Moment instance = new Moment(23,45,10);
        int expResult = 23;
        int result = instance.getHour();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getMinute method, of class Moment.
     */
    @Test
    public void testGetMinute() {
        System.out.println("getMinute");
        Moment instance = new Moment(5,33,6);
        int expResult = 33;
        int result = instance.getMinute();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getSecond method, of class Moment.
     */
    @Test
    public void testGetSecond() {
        System.out.println("getSecond");
        Moment instance = new Moment(5,7,1);
        int expResult = 1;
        int result = instance.getSecond();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of toString method, of class Moment.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Moment instance = new Moment(5,33,6);
        String expResult = "Moment{hour=5, minute=33, second=6}";
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }
    
}

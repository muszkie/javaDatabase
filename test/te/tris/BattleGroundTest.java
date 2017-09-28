/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package te.tris;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author muszkie
 */
public class BattleGroundTest {
    
    public BattleGroundTest() {
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
     * Test of fillBattleGround method, of class BattleGround.
     */
    @Test
    public void testFillBattleGround() {
        System.out.println("fillBattleGround");
        BattleGround instance = null;
        instance.fillBattleGround();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBattleGround method, of class BattleGround.
     */
    @Test
    public void testGetBattleGround() {
        System.out.println("getBattleGround");
        BattleGround instance = null;
        Minesweeper.fieldType[][] expResult = null;
        Minesweeper.fieldType[][] result = instance.getBattleGround();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBattleGroundFieldType method, of class BattleGround.
     */
    @Test
    public void testGetBattleGroundFieldType() {
        System.out.println("getBattleGroundFieldType");
        int x = 0;
        int y = 0;
        BattleGround instance = null;
        String expResult = "";
        String result = instance.getBattleGroundFieldType(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBattleGroundFieldIfVisited method, of class BattleGround.
     */
    @Test
    public void testGetBattleGroundFieldIfVisited() {
        System.out.println("getBattleGroundFieldIfVisited");
        int x = 0;
        int y = 0;
        BattleGround instance = null;
        boolean expResult = false;
        boolean result = instance.getBattleGroundFieldIfVisited(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBattleGroundFieldVisited method, of class BattleGround.
     */
    @Test
    public void testSetBattleGroundFieldVisited() {
        System.out.println("setBattleGroundFieldVisited");
        int x = 0;
        int y = 0;
        BattleGround instance = null;
        instance.setBattleGroundFieldVisited(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBattleWidth method, of class BattleGround.
     */
    @Test
    public void testGetBattleWidth() {
        System.out.println("getBattleWidth");
        BattleGround instance = null;
        int expResult = 0;
        int result = instance.getBattleWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBattleHeight method, of class BattleGround.
     */
    @Test
    public void testGetBattleHeight() {
        System.out.println("getBattleHeight");
        BattleGround instance = null;
        int expResult = 0;
        int result = instance.getBattleHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

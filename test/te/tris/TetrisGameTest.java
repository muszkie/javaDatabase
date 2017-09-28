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
public class TetrisGameTest {
    
    public TetrisGameTest() {
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
     * Test of gameOver method, of class TetrisGame.
     */
    @Test
    public void testGameOver() {
        System.out.println("gameOver");
        TetrisGame instance = new TetrisGame();
        boolean expResult = false;
        boolean result = instance.gameOver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScore method, of class TetrisGame.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        TetrisGame instance = new TetrisGame();
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetScore method, of class TetrisGame.
     */
    @Test
    public void testResetScore() {
        System.out.println("resetScore");
        TetrisGame instance = new TetrisGame();
        instance.resetScore();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isThisPlayerCheating method, of class TetrisGame.
     */
    @Test
    public void testIsThisPlayerCheating() {
        System.out.println("isThisPlayerCheating");
        TetrisGame instance = new TetrisGame();
        boolean expResult = false;
        boolean result = instance.isThisPlayerCheating();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TimerPause method, of class TetrisGame.
     */
    @Test
    public void testTimerPause() {
        System.out.println("TimerPause");
        TetrisGame instance = new TetrisGame();
        instance.TimerPause();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class TetrisGame.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TetrisGame.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

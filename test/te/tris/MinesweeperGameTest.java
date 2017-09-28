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
public class MinesweeperGameTest {
    
    public MinesweeperGameTest() {
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
     * Test of gameOver method, of class MinesweeperGame.
     */
    @Test
    public void testGameOver() {
        System.out.println("gameOver");
        MinesweeperGame instance = new MinesweeperGame();
        boolean expResult = false;
        boolean result = instance.gameOver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class MinesweeperGame.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        MinesweeperGame instance = new MinesweeperGame();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class MinesweeperGame.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MinesweeperGame.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScore method, of class MinesweeperGame.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        MinesweeperGame instance = new MinesweeperGame();
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetScore method, of class MinesweeperGame.
     */
    @Test
    public void testResetScore() {
        System.out.println("resetScore");
        MinesweeperGame instance = new MinesweeperGame();
        instance.resetScore();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

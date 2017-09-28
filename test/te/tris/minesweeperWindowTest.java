/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package te.tris;

import java.awt.Graphics;
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
public class minesweeperWindowTest {
    
    public minesweeperWindowTest() {
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
     * Test of reset method, of class minesweeperWindow.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        minesweeperWindow instance = new minesweeperWindow();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paintComponent method, of class minesweeperWindow.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        minesweeperWindow instance = new minesweeperWindow();
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVisited method, of class minesweeperWindow.
     */
    @Test
    public void testSetVisited() {
        System.out.println("setVisited");
        minesweeperWindow instance = new minesweeperWindow();
        instance.setVisited();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBombFound method, of class minesweeperWindow.
     */
    @Test
    public void testSetBombFound() {
        System.out.println("setBombFound");
        minesweeperWindow instance = new minesweeperWindow();
        instance.setBombFound();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gameWin method, of class minesweeperWindow.
     */
    @Test
    public void testGameWin() {
        System.out.println("gameWin");
        minesweeperWindow instance = new minesweeperWindow();
        boolean expResult = false;
        boolean result = instance.gameWin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gameOver method, of class minesweeperWindow.
     */
    @Test
    public void testGameOver() {
        System.out.println("gameOver");
        minesweeperWindow instance = new minesweeperWindow();
        boolean expResult = false;
        boolean result = instance.gameOver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showText method, of class minesweeperWindow.
     */
    @Test
    public void testShowText() {
        System.out.println("showText");
        minesweeperWindow instance = new minesweeperWindow();
        instance.showText();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

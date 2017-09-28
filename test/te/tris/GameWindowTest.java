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
public class GameWindowTest {
    
    public GameWindowTest() {
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
     * Test of refresh method, of class GameWindow.
     */
    @Test
    public void testRefresh() {
        System.out.println("refresh");
        GameWindow instance = new GameWindow();
        instance.refresh();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paintComponent method, of class GameWindow.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        GameWindow instance = new GameWindow();
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkIfPointAddedThisTime method, of class GameWindow.
     */
    @Test
    public void testCheckIfPointAddedThisTime() {
        System.out.println("checkIfPointAddedThisTime");
        GameWindow instance = new GameWindow();
        boolean expResult = false;
        boolean result = instance.checkIfPointAddedThisTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cleanRow method, of class GameWindow.
     */
    @Test
    public void testCleanRow() {
        System.out.println("cleanRow");
        int row = 0;
        GameWindow instance = new GameWindow();
        instance.cleanRow(row);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restart method, of class GameWindow.
     */
    @Test
    public void testRestart() {
        System.out.println("restart");
        GameWindow instance = new GameWindow();
        instance.restart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

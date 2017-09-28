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
public class MinesweeperTest {
    
    public MinesweeperTest() {
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
     * Test of main method, of class Minesweeper.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Minesweeper.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFieldType method, of class Minesweeper.
     */
    @Test
    public void testGetFieldType() {
        System.out.println("getFieldType");
        int x = 0;
        int y = 0;
        Minesweeper instance = new Minesweeper();
        String expResult = "";
        String result = instance.getFieldType(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIfFieldVisited method, of class Minesweeper.
     */
    @Test
    public void testGetIfFieldVisited() {
        System.out.println("getIfFieldVisited");
        int x = 0;
        int y = 0;
        Minesweeper instance = new Minesweeper();
        boolean expResult = false;
        boolean result = instance.getIfFieldVisited(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeFieldVisited method, of class Minesweeper.
     */
    @Test
    public void testMakeFieldVisited() {
        System.out.println("makeFieldVisited");
        int x = 0;
        int y = 0;
        Minesweeper instance = new Minesweeper();
        instance.makeFieldVisited(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

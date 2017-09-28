/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package te.tris;

import java.awt.Color;
import java.awt.Point;
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
public class Shape_STest {
    
    public Shape_STest() {
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
     * Test of getPoints method, of class Shape_S.
     */
    @Test
    public void testGetPoints() {
        System.out.println("getPoints");
        Shape_S instance = new Shape_S();
        Point[] expResult = null;
        Point[] result = instance.getPoints();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Shape_S.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Shape_S instance = new Shape_S();
        Color expResult = null;
        Color result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rotate method, of class Shape_S.
     */
    @Test
    public void testRotate() {
        System.out.println("rotate");
        Shape_S instance = new Shape_S();
        instance.rotate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reRotate method, of class Shape_S.
     */
    @Test
    public void testReRotate() {
        System.out.println("reRotate");
        Shape_S instance = new Shape_S();
        instance.reRotate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveLeft method, of class Shape_S.
     */
    @Test
    public void testMoveLeft() {
        System.out.println("moveLeft");
        Shape_S instance = new Shape_S();
        instance.moveLeft();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveRight method, of class Shape_S.
     */
    @Test
    public void testMoveRight() {
        System.out.println("moveRight");
        Shape_S instance = new Shape_S();
        instance.moveRight();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveDown method, of class Shape_S.
     */
    @Test
    public void testMoveDown() {
        System.out.println("moveDown");
        Shape_S instance = new Shape_S();
        instance.moveDown();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveUp method, of class Shape_S.
     */
    @Test
    public void testMoveUp() {
        System.out.println("moveUp");
        Shape_S instance = new Shape_S();
        instance.moveUp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

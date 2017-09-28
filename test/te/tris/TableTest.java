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
public class TableTest {
    
    public TableTest() {
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
     * Test of getColor method, of class Table.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        int x = 0;
        int y = 0;
        Table instance = new Table();
        Color expResult = null;
        Color result = instance.getColor(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Table.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        int x = 0;
        int y = 0;
        Color color = null;
        Table instance = new Table();
        instance.setColor(x, y, color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkIfThereIsSpace method, of class Table.
     */
    @Test
    public void testCheckIfThereIsSpace() {
        System.out.println("checkIfThereIsSpace");
        Point[] points = null;
        Table instance = new Table();
        boolean expResult = false;
        boolean result = instance.checkIfThereIsSpace(points);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addShape method, of class Table.
     */
    @Test
    public void testAddShape() {
        System.out.println("addShape");
        Shape shape = null;
        Table instance = new Table();
        instance.addShape(shape);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of copyTable method, of class Table.
     */
    @Test
    public void testCopyTable() {
        System.out.println("copyTable");
        Table tableToCopy = null;
        Table instance = new Table();
        instance.copyTable(tableToCopy);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

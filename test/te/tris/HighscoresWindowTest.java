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
public class HighscoresWindowTest {
    
    public HighscoresWindowTest() {
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
     * Test of showScores method, of class HighscoresWindow.
     */
    @Test
    public void testShowScores() {
        System.out.println("showScores");
        Highscores highscore = null;
        HighscoresWindow instance = new HighscoresWindow();
        instance.showScores(highscore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class HighscoresWindow.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        HighscoresWindow.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of highscoreOver method, of class HighscoresWindow.
     */
    @Test
    public void testHighscoreOver() {
        System.out.println("highscoreOver");
        HighscoresWindow instance = new HighscoresWindow();
        boolean expResult = false;
        boolean result = instance.highscoreOver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

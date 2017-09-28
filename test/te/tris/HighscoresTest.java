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
public class HighscoresTest {
    
    public HighscoresTest() {
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
     * Test of makeConnection method, of class Highscores.
     */
    @Test
    public void testMakeConnection() throws Exception {
        System.out.println("makeConnection");
        Highscores instance = new Highscores();
        instance.makeConnection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeDESC method, of class Highscores.
     */
    @Test
    public void testMakeDESC() {
        System.out.println("makeDESC");
        Highscores instance = new Highscores();
        instance.makeDESC();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScores method, of class Highscores.
     */
    @Test
    public void testGetScores() {
        System.out.println("getScores");
        Highscores instance = new Highscores();
        Score[] expResult = null;
        Score[] result = instance.getScores();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addScoreASC method, of class Highscores.
     */
    @Test
    public void testAddScoreASC() {
        System.out.println("addScoreASC");
        String name = "";
        int score = 0;
        Highscores instance = new Highscores();
        instance.addScoreASC(name, score);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addScoreDESC method, of class Highscores.
     */
    @Test
    public void testAddScoreDESC() {
        System.out.println("addScoreDESC");
        String name = "";
        int score = 0;
        Highscores instance = new Highscores();
        instance.addScoreDESC(name, score);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of wczytajZBazyASC method, of class Highscores.
     */
    @Test
    public void testWczytajZBazyASC() {
        System.out.println("wczytajZBazyASC");
        String nazwa = "";
        Highscores instance = new Highscores();
        instance.wczytajZBazyASC(nazwa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of wczytajZBazyDESC method, of class Highscores.
     */
    @Test
    public void testWczytajZBazyDESC() {
        System.out.println("wczytajZBazyDESC");
        String nazwa = "";
        Highscores instance = new Highscores();
        instance.wczytajZBazyDESC(nazwa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of wczytajPlikASC method, of class Highscores.
     */
    @Test
    public void testWczytajPlikASC() {
        System.out.println("wczytajPlikASC");
        String nazwa = "";
        Highscores instance = new Highscores();
        instance.wczytajPlikASC(nazwa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of wczytajPlikDESC method, of class Highscores.
     */
    @Test
    public void testWczytajPlikDESC() {
        System.out.println("wczytajPlikDESC");
        String nazwa = "";
        Highscores instance = new Highscores();
        instance.wczytajPlikDESC(nazwa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of zapiszBaze method, of class Highscores.
     */
    @Test
    public void testZapiszBaze() {
        System.out.println("zapiszBaze");
        String nazwa = "";
        Highscores instance = new Highscores();
        instance.zapiszBaze(nazwa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of zapiszPlik method, of class Highscores.
     */
    @Test
    public void testZapiszPlik() {
        System.out.println("zapiszPlik");
        String nazwa = "";
        Highscores instance = new Highscores();
        instance.zapiszPlik(nazwa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

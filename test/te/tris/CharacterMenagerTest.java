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
public class CharacterMenagerTest {
    
    public CharacterMenagerTest() {
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
     * Test of addTetrisScore method, of class CharacterMenager.
     */
    @Test
    public void testAddTetrisScore() {
        System.out.println("addTetrisScore");
        int score = 0;
        CharacterMenager instance = null;
        instance.addTetrisScore(score);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSaperScore method, of class CharacterMenager.
     */
    @Test
    public void testAddSaperScore() {
        System.out.println("addSaperScore");
        int score = 0;
        CharacterMenager instance = null;
        instance.addSaperScore(score);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of upgradeTetris method, of class CharacterMenager.
     */
    @Test
    public void testUpgradeTetris() {
        System.out.println("upgradeTetris");
        CharacterMenager instance = null;
        instance.upgradeTetris();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of upgradeSaper method, of class CharacterMenager.
     */
    @Test
    public void testUpgradeSaper() {
        System.out.println("upgradeSaper");
        CharacterMenager instance = null;
        instance.upgradeSaper();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountBalance method, of class CharacterMenager.
     */
    @Test
    public void testGetAccountBalance() {
        System.out.println("getAccountBalance");
        CharacterMenager instance = null;
        int expResult = 0;
        int result = instance.getAccountBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of updateUser method, of class CharacterMenager.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        CharacterMenager instance = null;
        instance.updateUser();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class CharacterMenager.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        CharacterMenager instance = null;
        boolean expResult = false;
        boolean result = instance.login();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

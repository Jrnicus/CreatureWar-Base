

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestBattles.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestBattles
{
    private Battle battle;
    
    /**
     * Default constructor for test class TestBattles
     */
    public TestBattles()
    {
        battle = new Battle();

    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testreset()
    {
        battle.battle();
        
        for(int i = 0; i < 100; i++)
        {
            battle.resetArmys();
            battle.battle();
        }
        System.out.println("\narmy 1 wins " + battle.army1Wins);
        System.out.println("army 2 wins " + battle.army2Wins);
        System.out.println("Draws " + battle.draws);
    }
    
    @Test
    public void testNewArmys()
    {
        battle.battle();
        
        for(int i = 0; i < 100; i++)
        {
            battle.generateNewArmys();
            battle.battle();
        }
        System.out.println("\narmy 1 wins " + battle.army1Wins);
        System.out.println("army 2 wins " + battle.army2Wins);
        System.out.println("Draws " + battle.draws);
    }
}


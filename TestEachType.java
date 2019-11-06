

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestEachType.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestEachType
{
    private Human humanTest;
    private Elf elfTest;
    private Demon demonTest;
    private Cyberdemon cyberdemonTest;
    private Balrog balrogTest;
    
    /**
     * Default constructor for test class TestEachType
     */
    public TestEachType()
    {
        humanTest = new Human();
        elfTest = new Elf();
        demonTest = new Demon(0, 0, 0, 0);
        cyberdemonTest = new Cyberdemon();
        balrogTest = new Balrog();
        
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
}

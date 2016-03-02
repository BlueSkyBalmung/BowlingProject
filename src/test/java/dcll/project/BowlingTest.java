package dcll.project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class BowlingTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public BowlingTest(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( BowlingTest.class );
    }

    /**
     *
     */
    public void Test()
    {
        ArrayList<Integer> jeu = new ArrayList<Integer>(12);
        for (int i = 0; i < 10; i++)
            jeu.add(0);
        Bowling bowling = new Bowling(jeu);
        assertTrue( true );
    }
}

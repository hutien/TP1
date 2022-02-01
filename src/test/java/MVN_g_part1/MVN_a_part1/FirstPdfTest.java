package MVN_g_part1.MVN_a_part1;

import static org.junit.Assert.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class FirstPdfTest extends TestCase{

	
	/*public void test() {
		fail("Not yet implemented");
	}
*/
	 public FirstPdfTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FirstPdfTest.class );
    }

	
	
	
	public void test1() {
		assertTrue(true);
	}
	
	
	
	
	
	
}

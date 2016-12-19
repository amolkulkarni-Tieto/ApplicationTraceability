package tieto.at.DomainServices;

import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import tieto.at.DomainEntities.*;
import tieto.at.Repositories.IReadOnlyRepository;
import tieto.at.Repositories.SLLApplicationRepository;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    
    public void testGetAll()
    {
    	IReadOnlyRepository<SllApplication> repo  = new SLLApplicationRepository();
        List<SllApplication> appList  = new ApplicationServices(repo).GetAll();
        assertTrue(appList!=null && appList.size()>0);
        
    	
    }
}

package tieto.at.Repositories;

import org.hibernate.Session;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import tieto.at.DomainEntities.*;


import java.util.List;

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

    
   public void testConnection()
    {
    	SLLApplicationRepository appRepo  =  new SLLApplicationRepository();
        Session session  =  appRepo.GetSession();
        assertNotNull(session);
    }
    
    public void testSelectApplication()
    
    {
    	IReadOnlyRepository<SllApplication> appRepo  =  new SLLApplicationRepository();
    	List<SllApplication> results  =  appRepo.All();
    	assertTrue(results!=null && results.size()>0);
    	
    }
    public void testSelectApplicationArea()
    
    {
    	IReadOnlyRepository<SllApplication> appRepo  =  new SLLApplicationRepository();
    	List<SllApplication> results  =  appRepo.All();
    	assertTrue(results!=null && results.size()>0&&results.get(0).getArea()!=null);
    	
    }
}

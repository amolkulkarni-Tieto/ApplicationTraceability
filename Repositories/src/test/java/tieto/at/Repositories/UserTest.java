package tieto.at.Repositories;

import java.util.List;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import tieto.at.DomainEntities.SllUser;

public class UserTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public UserTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( UserTest.class );
    }
    
    public void TestGetUserByUserName()
    {
    		UserRepository repo = new UserRepository();
    		List<SllUser> users  = repo.GetByField("username", "Amol", 1);
    		Assert.assertEquals(users.size(), 1);
    		
    	
    }


}

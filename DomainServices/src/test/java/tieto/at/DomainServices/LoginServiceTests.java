package tieto.at.DomainServices;

import java.util.List;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import tieto.at.DomainEntities.SllApplication;
import tieto.at.DomainEntities.SllUser;
import tieto.at.Repositories.IReadOnlyRepository;
import tieto.at.Repositories.SLLApplicationRepository;
import tieto.at.Repositories.UserRepository;

public class LoginServiceTests extends TestCase 
{
	
	public LoginServiceTests( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( LoginServiceTests.class );
    }

   

    public void testGetUser()
    {
    	IReadOnlyRepository<SllUser> repo  = new UserRepository();
        LoginService service = new LoginService(repo);
        Boolean returnval = service.Login("Amol", "Amol");
        Assert.assertTrue(returnval);
    }

}

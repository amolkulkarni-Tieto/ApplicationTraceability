package org.InfrastrcutureUtils;

import java.io.File;

import org.InfrastructureInterfaces.IATLogger;


import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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

    /**
     * Rigourous Test :-)
     */
//    public void testTrace()
//    {
//        //IATLogger logger  =  new ATLogger();
//        
//        //String log4jConfigFile = System.getProperty("user.dir")
//          //      + File.separator + "log4j.properties";
//        
//        ApplicationContext context = new ClassPathXmlApplicationContext(
//				"Spring-Module.xml");
//
//        IATLogger logger = (IATLogger) context.getBean("logger");
//		
//        logger.Trace("Sample Test");
//        Assert.assertTrue(true);
//    }
    public void testException()
    {
        
       
        try{
        Exception ex   =  new Exception("This is a test exception");
        
        throw ex;
        }
        catch(Exception ex)
        {
        	IATLogger logger  =  new ATLogger();
        	logger.Error("caught the exception ",ex);
        	
        }
        
       
           Assert.assertTrue(true);
    }
}

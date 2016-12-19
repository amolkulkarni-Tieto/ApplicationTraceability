package org.InfrastrcutureUtils;

import org.InfrastructureInterfaces.*;
import org.apache.log4j.*;
import java.io.File;
public class ATLogger implements IATLogger {
	
	public static Logger _logger;
	
		
	private static Logger GetLogger()
	{
		if(_logger == null)
		{
			_logger =  Logger.getLogger("ATLogger");
			
			String logfile = System.getProperty("user.dir")
	                + File.separator + "ApplicationTraceability.log";
			
			
			System.setProperty("my.log", logfile);
			
			String log4jConfigFile = System.getProperty("user.dir")
	                + File.separator + "log4j.properties";
			
	       PropertyConfigurator.configure(log4jConfigFile);
	        
		}
		return _logger;
	}
	public void Trace(String message) {
		
		Logger  logger =  GetLogger();
		logger.trace(message);
		
	}

	public void Debug(String message) {
		
		Logger  logger =  GetLogger();
		logger.debug(message);
	}

	public void Error(String message, Exception ex) {
		Logger  logger =  GetLogger();
		logger.error(message, ex);

	}

}

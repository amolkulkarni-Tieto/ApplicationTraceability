package tieto.at.PublicServices;

import java.util.*;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.InfrastrcutureUtils.*;
import org.InfrastructureInterfaces.*;
import org.springframework.beans.factory.annotation.Autowired;

import io.swagger.annotations.Api;
import tieto.at.DomainEntities.*;
import tieto.at.DomainServices.*;
@Api
@Path("/Application")
public class AppServices {
	
	
	private IApplicationServices  _appServices;
	private IATLogger _logger;
	
	@Inject
	public AppServices(IApplicationServices  appServices,IATLogger logger) {

		//_appServices =  new ApplicationServices();
		_logger =logger;
		_appServices = appServices;
	}
	
	@GET
	@Path("/All")
	//@Produces("application/json")
	@Produces( MediaType.APPLICATION_JSON )
	@Secured
	public Response GetAllApplications()
	{
		try{
			_logger.Trace("Started to get Application Information");
			List<SllApplication> output =  _appServices.GetAll();
			GenericEntity<List<SllApplication>> entity = new GenericEntity<List<SllApplication>>(output) {};
			_logger.Trace("Finished getting Application Information");
			return Response.ok(entity).build();
		}
		catch ( Exception ex)
		{
			_logger.Error("Error in get All Application", ex);
			return Response.serverError().build();
		}
		
	
	}

}
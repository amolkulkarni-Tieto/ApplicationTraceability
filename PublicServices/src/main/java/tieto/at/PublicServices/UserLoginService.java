package tieto.at.PublicServices;

import java.security.Key;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.json.Json;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.InfrastrcutureUtils.TokenUtility;
import org.InfrastructureInterfaces.IATLogger;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import io.swagger.annotations.Api;
import tieto.at.DomainServices.ILoginService;
@Api
@Path("/Authentication")
public class UserLoginService {

	private ILoginService  _loginService;
	private IATLogger _logger;

	@Inject
	public UserLoginService(ILoginService  loginService,IATLogger logger) {

		//_appServices =  new ApplicationServices();
		_logger =logger;
		_loginService = loginService;
		
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON )
    @Consumes("application/x-www-form-urlencoded")
	@Path("/Token")
	
	public Response Login( @FormParam("username") String username,@FormParam("password") String password)
	{
		try{
			_logger.Trace("Staretd Tracing login");
			 Boolean   loginResponse  =  _loginService.Login(username,password);
			 
			 if(loginResponse)
			 {
				 LoginResponse  response  =  new LoginResponse();
				 
				 String token = IssueToken(username);
				 response.setAccess_token(token);
				 long expirationTime  = TokenUtility.getExpiration();
				 response.setExpires(expirationTime);
					_logger.Trace("Token issued user authenticated " + Long.toString(expirationTime) );
					 
					return Response.ok(response).build();
					
			 }
			 _logger.Trace("Bad Credentials UnAuthorized");
			 return Response.status(Response.Status.UNAUTHORIZED).build();
			
		}
		catch ( Exception ex)
		{
			_logger.Error( "UnAuthorized Login" + username,ex);
			
			 return Response.status(Response.Status.UNAUTHORIZED).build();
		}
		
	
	}

	private String IssueToken(String username) {
		
		Key key = TokenUtility.getKey();
		long expirationTime = System.currentTimeMillis() + TokenUtility.getExpiration();
		Date expiration  =  new Date(expirationTime);
		 		
		String compactJws = Jwts.builder()
		  .setSubject(username)
		  .signWith(SignatureAlgorithm.HS512, key)
		  .setExpiration(expiration)
		  .setIssuer(TokenUtility.getIssuer())
		  .compact();
		return compactJws;
		
	}
}

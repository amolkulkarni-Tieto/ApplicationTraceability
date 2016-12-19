package tieto.at.PublicServices;

import java.io.IOException;

import javax.annotation.Priority;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import org.InfrastrcutureUtils.ATLogger;
import org.InfrastrcutureUtils.TokenUtility;
import org.InfrastructureInterfaces.IATLogger;

import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;

import javax.ws.rs.Priorities;
@Secured
@Provider
@Priority(Priorities.AUTHENTICATION)

public class AuthenticationRequestFilter implements ContainerRequestFilter {
 
    @Override
    public void filter(ContainerRequestContext requestContext)
                    throws IOException {
 
    	IATLogger  logger =  new ATLogger();
    	logger.Trace("Authentication Filter called");
    	
    	String authorizationHeader = 
                requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);

            // Check if the HTTP Authorization header is present and formatted correctly 
            if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer ")) {
                throw new NotAuthorizedException("Authorization header must be provided");
            }

            // Extract the token from the HTTP Authorization header
            String token = authorizationHeader.substring("Bearer".length()).trim();

            try {

                // Validate the token
                validateToken(token);

            } catch (Exception e) {
            	logger.Error("Token Authentication Failed", e);
                requestContext.abortWith(
                    Response.status(Response.Status.UNAUTHORIZED).build());
            }
    }

    private void validateToken(String token) throws Exception {

    	IATLogger  logger =  new ATLogger();
    	logger.Trace("Validate Token called ");
    	
    	Jwts.parser().requireIssuer(TokenUtility.getIssuer()).setSigningKey(TokenUtility.getKey()).parse(token);
    	 //Jwts.parser().setSigningKey().parseClaimsJws(token).getBody().getIssuer().equals(TokenUtility.getIssuer());
    	
    }
}
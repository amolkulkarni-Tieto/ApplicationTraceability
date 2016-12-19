package tieto.at.PublicServices;

import org.glassfish.jersey.server.ResourceConfig;

public class PublicServicesApplication extends ResourceConfig{

	public PublicServicesApplication() {
		register(new ApplicationBinder());
		register(AuthenticationRequestFilter.class);
		register(AppServices.class);
		register(UserLoginService.class);
		register(CORSResponseFilter.class);
		//register(io.swagger.jaxrs.listing.ApiListingResource.class);
		//register(io.swagger.jaxrs.listing.SwaggerSerializers.class);
	}
}

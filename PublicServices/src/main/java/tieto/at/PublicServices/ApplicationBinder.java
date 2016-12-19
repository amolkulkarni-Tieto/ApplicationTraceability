package tieto.at.PublicServices;

import org.InfrastrcutureUtils.ATLogger;
import org.InfrastructureInterfaces.IATLogger;
import org.glassfish.hk2.api.TypeLiteral;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

import tieto.at.DomainEntities.SllApplication;
import tieto.at.DomainEntities.SllUser;
import tieto.at.DomainServices.ApplicationServices;
import tieto.at.DomainServices.IApplicationServices;
import tieto.at.DomainServices.ILoginService;
import tieto.at.DomainServices.LoginService;
import tieto.at.Repositories.IReadOnlyRepository;

import tieto.at.Repositories.SLLApplicationRepository;
import tieto.at.Repositories.UserRepository;


public class ApplicationBinder extends AbstractBinder{
		  @Override
		  protected void configure() {
			  bind(ATLogger.class).to(IATLogger.class);
			  bind(SLLApplicationRepository.class).to(new TypeLiteral<IReadOnlyRepository<SllApplication>>() {});
		      bind(ApplicationServices.class).to(IApplicationServices.class);
		      
		      bind(UserRepository.class).to(new TypeLiteral<IReadOnlyRepository<SllUser>>() {});
		      bind(LoginService.class).to(ILoginService.class);
		      
		  }
		 }



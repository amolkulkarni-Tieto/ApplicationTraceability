package tieto.at.DomainServices;

import java.util.List;

import javax.inject.Inject;

import tieto.at.DomainEntities.*;
import tieto.at.Repositories.*;

public class ApplicationServices implements IApplicationServices {
	
	
	 private IReadOnlyRepository<SllApplication> _appRepository;
	 
	 @Inject
	public ApplicationServices(IReadOnlyRepository<SllApplication> appRepository)
	{
		 _appRepository =  appRepository;
		
	}

	public SllApplication Create(SllApplication application) {
		// TODO Auto-generated method stub
		return null;
	}

	public SllApplication Save(SllApplication application) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean Remove(SllApplication application) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public List<SllApplication> GetAll()
	{
		return _appRepository.All();
	}

}

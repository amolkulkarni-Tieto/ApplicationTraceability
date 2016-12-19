package tieto.at.DomainServices;

import java.util.List;

import tieto.at.DomainEntities.*;

public interface IApplicationServices {
	
	SllApplication Create(SllApplication application);
	SllApplication Save(SllApplication application);
	 boolean Remove(SllApplication application);
	 List<SllApplication> GetAll();
}

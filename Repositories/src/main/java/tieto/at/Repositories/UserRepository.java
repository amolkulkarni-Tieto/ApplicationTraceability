package tieto.at.Repositories;

import tieto.at.DomainEntities.SllUser;

public class UserRepository extends Repository<SllUser>{
	
	public UserRepository() {
		EntityClassName = "SllUser";
	}

}

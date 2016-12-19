package tieto.at.DomainServices;

import java.util.List;

import javax.inject.Inject;

import tieto.at.DomainEntities.SllUser;
import tieto.at.Repositories.IReadOnlyRepository;

public class LoginService implements ILoginService{
	
 private IReadOnlyRepository<SllUser> _userRepository;
	 
	 @Inject
	 public LoginService(IReadOnlyRepository<SllUser> userRepository) {
		// TODO Auto-generated constructor stub
		 _userRepository = userRepository;
	}
	public Boolean Login(String username, String password) {
		
		List<SllUser>  users =  _userRepository.GetByField("username", username, 1);
		
		if(users.isEmpty())
		{
			return false;
		}
		SllUser user  = users.get(0);
		
		if(user.getPassword().equals(password))
		{
			return true;
		}
		return false;
	}
	

}

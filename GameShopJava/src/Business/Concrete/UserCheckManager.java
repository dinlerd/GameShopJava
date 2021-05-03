package Business.Concrete;

import Business.Abstract.UserCheckService;
import Core.Entities.Concrete.User;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(User user) {
		// TODO Auto-generated method stub
		return true;
	}

}

package Business.Concrete;

import Business.Abstract.UserCheckService;
import Business.Abstract.UserService;
import Core.DataAccess.EntityRepositoryBase;
import Core.Entities.Concrete.User;
import DataAccess.Abstract.UserDal;

public class UserManager implements UserService{

	UserDal userDal;
	UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService, UserDal userDal) {
		this.userCheckService = userCheckService;
		this.userDal = userDal;
	}


	@Override
	public void add(User user) {
		
		if(userCheckService.checkIfRealPerson(user)) {
			userDal.add(user);
			System.out.println("User Added Successfuly..");
		}else {
			System.out.println("Not a valid person");
		}

	}


	@Override
	public void update(User user) {
		userDal.update(user);
		
	}


	@Override
	public void delete(User user) {
		userDal.delete(user);
		
	}
}

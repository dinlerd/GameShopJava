package Business.Abstract;

import Core.Entities.Concrete.User;

public interface UserCheckService {
	boolean checkIfRealPerson(User user);
}

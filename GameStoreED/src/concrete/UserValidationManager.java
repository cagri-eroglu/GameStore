package concrete;

import Abstract.UserValidationService;
import entitiy.Gamer;

public class UserValidationManager implements UserValidationService {

	@Override
	public boolean validate(Gamer gamer) {
		return true;
	}

}

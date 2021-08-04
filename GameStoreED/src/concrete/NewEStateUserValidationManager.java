package concrete;

import Abstract.UserValidationService;
import entitiy.Gamer;

public class  NewEStateUserValidationManager implements UserValidationService {

	@Override
	public boolean validate(Gamer gamer) {
		return true;
	}

}

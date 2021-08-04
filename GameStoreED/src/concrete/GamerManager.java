package concrete;

import Abstract.BaseGamerManager;
import Abstract.UserValidationService;
import entitiy.Gamer;

public class GamerManager extends BaseGamerManager {
	UserValidationService userValidationService;
	
	public GamerManager(UserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}
	
	@Override
	public void add(Gamer gamer) {
		if (userValidationService.validate(gamer)) {
			System.out.println("Added gamer: " + gamer.getFirstName() + " " + gamer.getLastName());
		} else {
			System.out.println(" The gamer is not valid ");
		}
	}
    
    @Override
	public void delete(Gamer gamer) {
		if (userValidationService.validate(gamer)) {
			System.out.println("deleted gamer : " + gamer.getFirstName() + " " + gamer.getLastName());
		} else {
			System.out.println(" The gamer is not valid ");
		}
	}
    
    @Override
	public void update(Gamer gamer) {
		if (userValidationService.validate(gamer)) {
			System.out.println("updated gamer : " + gamer.getFirstName() + " " + gamer.getLastName());
		} else {
			System.out.println(" The gamer is not valid");
		}
	}
	
	
}

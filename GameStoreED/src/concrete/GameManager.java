package concrete;

import Abstract.GameService;
import entitiy.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Added : " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Deleted : " + game.getGameName());
		
	}
 
	public void delete(Game game) {
		System.out.println("Updated : " + game.getGameName());
		
	}

}

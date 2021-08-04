package concrete;

import Abstract.SaleService;
import entitiy.Campaign;
import entitiy.Game;
import entitiy.Gamer;

public class SaleManager implements SaleService {

	public void sale(Gamer gamer, Game game) {
		System.out.println("'" + gamer.getFirstName() + " " + gamer.getLastName() + "'" + " purchased the game named " + "'" + game.getGameName());
		
	}

	
	public void campaignSale(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("'" + gamer.getFirstName() + " " + gamer.getLastName() + "'" + " purchased the game named " + "'" + game.getGameName()+ "' with " +  game.getPrice() * campaign.getCampaignDiscount()/100 + " % discount");
		
	}
	
}

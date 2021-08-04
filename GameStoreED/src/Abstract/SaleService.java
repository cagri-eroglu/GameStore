package Abstract;

import entitiy.Campaign;
import entitiy.Game;
import entitiy.Gamer;

public interface SaleService {
	void sale(Gamer gamer,Game game);
	void campaignSale(Gamer gamer,Game game,Campaign campaign);
}

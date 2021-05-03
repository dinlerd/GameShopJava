package Business.Concrete;

import Business.Abstract.SalesService;
import Core.DataAccess.EntityRepositoryBase;
import Core.Entities.Concrete.User;
import DataAccess.Abstract.SalesDal;
import Entities.Campaign;
import Entities.Game;

public class SalesManager implements SalesService{

	SalesDal salesDal;
	
	public SalesManager(SalesDal salesDal) {
		this.salesDal = salesDal;
	}

	@Override
	public void sell(User user, Game game) {
		System.out.println(game.getGameName() + " sold to " + user.getFirstName() + " with a price of " + game.getGamePrice());
	}
	
	@Override
	public void sell(User user, Game game, Campaign campaign) {
		double price = game.getGamePrice() * (100 - campaign.getcampaignDiscountPercent()) /100;
		System.out.println(game.getGameName() + " sold to " + user.getFirstName() + " with a discounted price of " + price);
	}

	@Override
	public void add(Game game) {
		salesDal.add(game);
		
	}

	@Override
	public void update(Game game) {
		salesDal.update(game);
		
	}

	@Override
	public void delete(Game game) {
		salesDal.delete(game);
		
	}
}
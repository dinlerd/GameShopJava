package ConsoleUI;

import java.time.LocalDate;

import Business.Abstract.CampaignService;
import Business.Abstract.SalesService;
import Business.Abstract.UserService;
import Business.Adapters.MernisServiceAdapter;
import Business.Concrete.CampaignManager;
import Business.Concrete.SalesManager;
import Business.Concrete.UserManager;
import Core.Entities.Concrete.User;
import DataAccess.Concrete.DataCampaignDal;
import DataAccess.Concrete.DataSalesDal;
import DataAccess.Concrete.DataUserDal;
import Entities.Campaign;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"Deniz","Dinler","123451234",LocalDate.of(1989, 7, 19),"dinler@dinler.com");
		Game game1 = new Game(1,"Warcraft",200);
		Campaign studentCampaign = new Campaign(1,"StudentCampaign",30);
		
		UserService userManager = new UserManager(new MernisServiceAdapter(), new DataUserDal());
		userManager.add(user1);
		
		CampaignService campaignManager = new CampaignManager(new DataCampaignDal());
		campaignManager.add(studentCampaign);
		
		SalesService salesManager = new SalesManager(new DataSalesDal());
		salesManager.sell(user1, game1);
		salesManager.sell(user1, game1, studentCampaign);
	}

}

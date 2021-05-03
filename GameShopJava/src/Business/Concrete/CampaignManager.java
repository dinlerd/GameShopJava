package Business.Concrete;

import Business.Abstract.CampaignService;
import DataAccess.Abstract.CampaignDal;
import Entities.Campaign;


public class CampaignManager implements CampaignService{

	CampaignDal campaignDal;
	
	public CampaignManager(CampaignDal campaignDal) {
		this.campaignDal = campaignDal;
	}

	@Override
	public void add(Campaign campaign) {
		campaignDal.add(campaign);
	}

	@Override
	public void update(Campaign campaign) {
		campaignDal.update(campaign);
	}

	@Override
	public void delete(Campaign campaign) {
		campaignDal.delete(campaign);
	}
	
	

}

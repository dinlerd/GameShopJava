package Entities;

import Core.Entities.Entity;

public class Campaign implements Entity {

	private int id;
	private String campaignName;
	private double campaignDiscountPercent;
	
	public Campaign() {
		
	}
	
	public Campaign(int id, String campaignName, double campaignDiscountPercent) {
		this.id = id;
		this.campaignName = campaignName;
		this.campaignDiscountPercent = campaignDiscountPercent;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public double getcampaignDiscountPercent() {
		return campaignDiscountPercent;
	}
	public void setcampaignDiscountPercent(double campaignDiscountPercent) {
		this.campaignDiscountPercent = campaignDiscountPercent;
	}
	
	
}

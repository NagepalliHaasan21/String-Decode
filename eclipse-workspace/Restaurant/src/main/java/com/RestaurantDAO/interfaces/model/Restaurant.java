package com.RestaurantDAO.interfaces.model;

public class Restaurant
{
	private String restaurantid;
	private String name;
	private String cuisinetype;
	private int deliverytime;
	private String address;
	private float ratings;
	private boolean isActive;
	private String imagepath;
	
	public String getRestaurantid() {
		return restaurantid;
	}
	public void setRestaurantid(String restaurantid) {
		this.restaurantid = restaurantid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCuisinetype() {
		return cuisinetype;
	}
	public void setCuisinetype(String cuisinetype) {
		this.cuisinetype = cuisinetype;
	}
	public int getDeliverytime() {
		return deliverytime;
	}
	public void setDeliverytime(int deliverytime) {
		this.deliverytime = deliverytime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	
	public Restaurant() {
		super();
	}
	
	public Restaurant(String restaurantid, String name, String cuisinetype, int deliverytime, String address,
			float ratings, boolean isActive, String imagepath) {
		super();
		this.restaurantid = restaurantid;
		this.name = name;
		this.cuisinetype = cuisinetype;
		this.deliverytime = deliverytime;
		this.address = address;
		this.ratings = ratings;
		this.isActive = isActive;
		this.imagepath = imagepath;
	}
	
	@Override
	public String toString()
	{
		return restaurantid + "    " + name + "    " + cuisinetype + "     " + deliverytime + "      " +
				address + "     " + ratings + "    " + isActive +"    " + imagepath ;
	}
}

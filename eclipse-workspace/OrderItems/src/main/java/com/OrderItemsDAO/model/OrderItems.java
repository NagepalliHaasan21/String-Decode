package com.OrderItemsDAO.model;

public class OrderItems 
{
	private int orderItemsid;
	private int ordersid;
	private int menuid;
	private int	quantity;
	private float itemtotal;
	
	public int getOrderItemsid() {
		return orderItemsid;
	}
	public void setOrderItemsid(int orderItemsid) {
		this.orderItemsid = orderItemsid;
	}
	public int getOrdersid() {
		return ordersid;
	}
	public void setOrdersid(int ordersid) {
		this.ordersid = ordersid;
	}
	public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getItemtotal() {
		return itemtotal;
	}
	public void setItemtotal(float itemtotal) {
		this.itemtotal = itemtotal;
	}
	
	public OrderItems() {
		super();
	}
	
	public OrderItems(int orderItemsid, int ordersid, int menuid, int quantity, float itemtotal) {
		super();
		this.orderItemsid = orderItemsid;
		this.ordersid = ordersid;
		this.menuid = menuid;
		this.quantity = quantity;
		this.itemtotal = itemtotal;
	}
	
	@Override
	public String toString()
	{
		return orderItemsid + "    " + ordersid + "     " + menuid + "     " + quantity + "     " + itemtotal;
	}	
}





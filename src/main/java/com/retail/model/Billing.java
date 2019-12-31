package com.retail.model;

import java.util.Arrays;
import java.util.List;

public class Billing {

	private int ID;
	private User user;
	private double netAmount;
	private double billAmount;
	private double discountedAmount;
	private List<Items> items;
	private String itemType;

	public Billing() {
		super();
		// TODO Auto-generated constructor stub
	}

	 

	public Billing(int iD, User user, double netAmount, double billAmount, double discountedAmount, List<Items> items,
			String itemType) {
		super();
		ID = iD;
		this.user = user;
		this.netAmount = netAmount;
		this.billAmount = billAmount;
		this.discountedAmount = discountedAmount;
		this.items = items;
		this.itemType = itemType;
	}



	public String getItemType() {
		return itemType;
	}



	public void setItemType(String itemType) {
		this.itemType = itemType;
	}



	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(double net_amount) {
		this.netAmount = net_amount;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double bill_amount) {
		this.billAmount = bill_amount;
	}

	public double getDiscountedAmount() {
		return discountedAmount;
	}

	public void setDiscountedAmount(double discounted_amount) {
		this.discountedAmount = discounted_amount;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		long temp;
		temp = Double.doubleToLongBits(billAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(discountedAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((itemType == null) ? 0 : itemType.hashCode());
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		temp = Double.doubleToLongBits(netAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Billing other = (Billing) obj;
		if (ID != other.ID)
			return false;
		if (Double.doubleToLongBits(billAmount) != Double.doubleToLongBits(other.billAmount))
			return false;
		if (Double.doubleToLongBits(discountedAmount) != Double.doubleToLongBits(other.discountedAmount))
			return false;
		if (itemType == null) {
			if (other.itemType != null)
				return false;
		} else if (!itemType.equals(other.itemType))
			return false;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		if (Double.doubleToLongBits(netAmount) != Double.doubleToLongBits(other.netAmount))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Billing [ID=" + ID + ", user=" + user + ", netAmount=" + netAmount + ", billAmount=" + billAmount
				+ ", discountedAmount=" + discountedAmount + ", items=" + Arrays.toString(items.toArray()) + ", itemType=" + itemType + "]";
	}

	 

}

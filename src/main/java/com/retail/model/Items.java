package com.retail.model;

public class Items {
	private int id;
	private String itemName;
	private int itemPrice;

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Items(int id, String itemName, int itemPrice, String itemType) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.itemPrice = itemPrice;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", itemName=" + itemName + ", itemPrice=" + itemPrice + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + itemPrice;
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
		Items other = (Items) obj;
		if (id != other.id)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (itemPrice != other.itemPrice)
			return false;
		return true;
	}

}

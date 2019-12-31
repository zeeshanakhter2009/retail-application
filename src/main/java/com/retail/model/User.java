package com.retail.model;

public class User {
	private int ID;
	private String name;
	private int discountPercent;
	private String userType;
	private int yearsCount;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int iD, String name, int discount, String userType) {
		super();
		ID = iD;
		this.name = name;
		this.discountPercent = discount;
		this.userType = userType;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getYearsCount() {
		return yearsCount;
	}

	public void setYearsCount(int yearsCount) {
		this.yearsCount = yearsCount;
	}

	public User(int iD, String name, int discountPercent, String userType, int yearsCount) {
		super();
		ID = iD;
		this.name = name;
		this.discountPercent = discountPercent;
		this.userType = userType;
		this.yearsCount = yearsCount;
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", name=" + name + ", discountPercent=" + discountPercent + ", userType=" + userType
				+ ", yearsCount=" + yearsCount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + discountPercent;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
		result = prime * result + yearsCount;
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
		User other = (User) obj;
		if (ID != other.ID)
			return false;
		if (discountPercent != other.discountPercent)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		if (yearsCount != other.yearsCount)
			return false;
		return true;
	}

}

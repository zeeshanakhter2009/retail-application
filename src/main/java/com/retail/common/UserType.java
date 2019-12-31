package com.retail.common;

public enum UserType {

	LOYALTY(5),AFFILIATE(10), EMPLOYEE(30);

	private final int userTypeCode;

	UserType(int userTypeCode) {
		this.userTypeCode = userTypeCode;
	}

	public int getUserTypeCode() {
		return this.userTypeCode;
	}

}
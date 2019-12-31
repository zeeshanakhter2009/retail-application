package com.retail.common;

public enum ItemType {

	HEALTHY(3), BEAUTY(2), GROCERY(1);

	private final int userTypeCode;

	ItemType(int userTypeCode) {
		this.userTypeCode = userTypeCode;
	}

	public int getUserTypeCode() {
		return this.userTypeCode;
	}

}
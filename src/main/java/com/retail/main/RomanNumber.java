package com.retail.main;

public class RomanNumber {

	private int number;

	private static final int maxValue = 3000;

	public RomanNumber(int number) throws Exception {
		if (number > maxValue)
			throw new Exception("RomanNumber only supports numbers up to 3000");
		this.number = number;
	}

	public void SetNumber(String number) throws Exception {
		this.number = Integer.parseInt(number);
		if (this.number > maxValue)
			throw new Exception("RomanNumber only supports numbers up to 3000");

	}

	public String convert() {
		String result = "";

		try {
			if (this.number >= 1000) {
				int thousands = this.number / 1000;
				System.out.println("thousands :: " + thousands);
				result += times(thousands, "M");
			}
			if (this.number >= 100) {
				int hundreds = this.number / 100 % 10;
				System.out.println("hundreds :: " + hundreds);
				result += times(hundreds, "C", "D", "M");
			}
			if (this.number >= 10) {

				int tens = this.number / 10 % 10;
				System.out.println("Tens :: " + tens);
				result += times(tens, "X", "L", "C");
			}
			if (this.number >= 1) {
				int ones = this.number % 10;
				System.out.println("ones :: " + ones);
				result += times(ones, "I", "V", "X");
			}
		} catch (Exception ex) {
			System.out.println("An error occured");
		}
		return result;
	}

	private String times(int number, String character) {
		String result = "";

		for (int i = 0; i < number; i++) {
			result += character;

		}
		return result;
	}

	private String times(int number, String o, String f, String t) throws Exception {
		switch (number) {
		case 0:
			return "";
		case 1:
		case 2:
		case 3:
			return times(number, o);
		case 4:
			return o + f;
		case 5:
		case 6:
		case 7:
		case 8:
			return f + times(number - 5, o);
		case 9:
			return o + t;
		default:
			throw new Exception("Only single digits allowed - not " + number);
		}
	}

	public static void main(String arg[]) {
		try {
			RomanNumber number = new RomanNumber(2999);
			System.out.println(number.convert());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

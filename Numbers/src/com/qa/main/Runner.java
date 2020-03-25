package com.qa.main;

public class Runner {

	public static void main(String[] args) {

		int digits = 10;
		int second = 200;
		int third = 9999;

		TenToNinetyNine number = new TenToNinetyNine();
		OneToAThousand threeDigitNumber = new OneToAThousand();
		OneToTenThousand fourDigitNumber = new OneToTenThousand();

		System.out.println(number.addsTwoDigitsTogether(digits));
		System.out.println(number.stringRepresentationOfNumber(digits));
		System.out.println(threeDigitNumber.toAThousand(second));
		System.out.println(fourDigitNumber.toTenThousand(third));

	}

}

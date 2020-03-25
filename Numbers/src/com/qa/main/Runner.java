package com.qa.main;

public class Runner {

	public static void main(String[] args) {

		int digits = 85;
		TenToNinetyNine number = new TenToNinetyNine();

		System.out.println(number.addsTwoDigitsTogether(digits));
		System.out.println(number.stringRepresentationOfNumber(digits));

	}

}

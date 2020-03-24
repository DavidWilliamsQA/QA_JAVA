package com.qa.main;

public class UniqueNumber {

	public int checkIfUnique(int first, int second, int third) {
		if (first == second) {
			if (first == third) {
				first = 0;
				second = 0;
				third = 0;
				return first + second + third;
			} else {
				first = 0;
				second = 0;
				return first + second + third;
			}
		} else if (first == third) {
			first = 0;
			third = 0;
			return first + second + third;
		} else if (second == third) {
			second = 0;
			third = 0;
			return first + second + third;
		}

		else {
			return first + second + third;
		}
	}

}

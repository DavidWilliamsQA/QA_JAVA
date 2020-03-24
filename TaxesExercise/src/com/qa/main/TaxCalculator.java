package com.qa.main;

public class TaxCalculator {

	public int salaryPercentage(double salary) {
		if (salary < 15000) {
			return 0;
		} else if (salary < 20000) {
			return 10;
		} else if (salary < 30000) {
			return 15;
		} else if (salary < 45000) {
			return 20;
		} else {
			return 25;
		}
	}

	public double amountBeingTaxed(double salary, int salaryBracket) {

		switch (salaryBracket) {

		case 0:
			return salary * 0;
		// break;

		case 10:
			return salary * 0.1;
		// break;

		case 15:
			return salary * 0.15;
		// break;

		case 20:
			return salary * 0.20;
		// break;

		case 25:
			return salary * 0.25;
		// break;

		default:
			return 0.0;
		}

	}

}

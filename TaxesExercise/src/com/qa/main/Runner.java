package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		TaxCalculator tax = new TaxCalculator();
		double salary = 15000.00;

		System.out.println("The amount being taxed on a salary of " + salary + " is "
				+ tax.amountBeingTaxed(salary, tax.salaryPercentage(salary)));
	}

}

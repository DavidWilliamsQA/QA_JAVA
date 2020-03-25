package com.qa.main;

public class OneToAThousand {

	public String toAThousand(int number) {

		String first = "";
		String second = "";
		String third = "";

		if (number < 21) {
			switch (number) {
			case 1:
				first = "one";
				break;
			case 2:
				first = "two";
				break;
			case 3:
				first = "three";
				break;
			case 4:
				first = "four";
				break;
			case 5:
				first = "five";
				break;
			case 6:
				first = "six";
				break;
			case 7:
				first = "seven";
				break;
			case 8:
				first = "eight";
				break;
			case 9:
				first = "nine";
				break;
			case 10:
				first = "ten";
				break;
			case 11:
				first = "eleven";
				break;
			case 12:
				first = "tweleve";
				break;
			case 13:
				first = "thirteen";
				break;
			case 14:
				first = "fourteen";
				break;
			case 15:
				first = "fifteen";
				break;
			case 16:
				first = "sixteen";
				break;
			case 17:
				first = "seventeen";
				break;
			case 18:
				first = "eighteen";
				break;
			case 19:
				first = "nineteen";
				break;
			case 20:
				first = "twenty ";
				break;
			}

		}

		else if (number > 20 && number < 1000) {
			int hundred = number / 100;
			int tenth = (number - (hundred * 100)) / 10;
			int unit = number - (hundred * 100) - (tenth * 10);

			switch (hundred) {
			case 1:
				first = "one hundred ";
				break;
			case 2:
				first = "two hundred ";
				break;
			case 3:
				first = "three hundred ";
				break;
			case 4:
				first = "four hundred ";
				break;
			case 5:
				first = "five hundred";
				break;
			case 6:
				first = "six hundred ";
				break;
			case 7:
				first = "seven hundred ";
				break;
			case 8:
				first = "eight hundred ";
				break;
			case 9:
				first = "nine hundred ";
				break;

			}

			switch (tenth) {
			case 2:
				second = "twenty";
				break;
			case 3:
				second = "thirty";
				break;
			case 4:
				second = "fourty";
				break;
			case 5:
				second = "fifty";
				break;
			case 6:
				second = "sixty";
				break;
			case 7:
				second = "seventy";
				break;
			case 8:
				second = "eighty";
				break;
			case 9:
				second = "ninety";
				break;
			}

			switch (unit) {
			case 1:
				third = "one";
				break;
			case 2:
				third = "two";
				break;
			case 3:
				third = "three";
				break;
			case 4:
				third = "four";
				break;
			case 5:
				third = "five";
				break;
			case 6:
				third = "six";
				break;
			case 7:
				third = "seven";
				break;
			case 8:
				third = "eight";
				break;
			case 9:
				third = "nine";
				break;
			}

		}

		else {
			return "This number is out of range";
		}

		return first + second + third;
	}

}

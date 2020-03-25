package com.qa.main;

public class OneToTenThousand {

	public String toTenThousand(int number) {
		String first = "";
		String second = "";
		String third = "";
		String fourth = "";

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

		else if (number > 20 && number < 10000) {
			int thousand = number / 1000;
			int hundred = (number - (thousand * 1000)) / 100;
			int tenth = (number - (thousand * 1000) - (hundred * 100)) / 10;
			int unit = number - (thousand * 1000) - (hundred * 100) - (tenth * 10);

			switch (thousand) {
			case 1:
				first = "one thousand ";
				break;
			case 2:
				first = "two thousand ";
				break;
			case 3:
				first = "three thousand ";
				break;
			case 4:
				first = "four thousand ";
				break;
			case 5:
				first = "five thousand ";
				break;
			case 6:
				first = "six thousand ";
				break;
			case 7:
				first = "seven thousand ";
				break;
			case 8:
				first = "eight thousand ";
				break;
			case 9:
				first = "nine thousand ";
				break;

			}

			switch (hundred) {
			case 1:
				second = "one hundred ";
				break;
			case 2:
				second = "two hundred ";
				break;
			case 3:
				second = "three hundred ";
				break;
			case 4:
				second = "four hundred ";
				break;
			case 5:
				second = "five hundred";
				break;
			case 6:
				second = "six hundred ";
				break;
			case 7:
				second = "seven hundred ";
				break;
			case 8:
				second = "eight hundred ";
				break;
			case 9:
				second = "nine hundred ";
				break;

			}

			switch (tenth) {
			case 2:
				third = "twenty ";
				break;
			case 3:
				third = "thirty ";
				break;
			case 4:
				third = "fourty ";
				break;
			case 5:
				third = "fifty ";
				break;
			case 6:
				third = "sixty ";
				break;
			case 7:
				third = "seventy ";
				break;
			case 8:
				third = "eighty ";
				break;
			case 9:
				third = "ninety ";
				break;
			}

			switch (unit) {
			case 1:
				fourth = "one";
				break;
			case 2:
				fourth = "two";
				break;
			case 3:
				fourth = "three";
				break;
			case 4:
				fourth = "four";
				break;
			case 5:
				fourth = "five";
				break;
			case 6:
				fourth = "six";
				break;
			case 7:
				fourth = "seven";
				break;
			case 8:
				fourth = "eight";
				break;
			case 9:
				fourth = "nine";
				break;
			}

		}

		else {
			return "This number is out of range";
		}

		return first + second + third + fourth;
	}
}

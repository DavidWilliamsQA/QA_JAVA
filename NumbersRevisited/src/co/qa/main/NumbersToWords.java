package co.qa.main;

public class NumbersToWords {

	public String numbersPrintWords(int number) {
		String first = "";
		String second = "";

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

		else if (number > 20 && number < 100) {
			int tenth = number / 10;
			int unit = number - (tenth * 10);

			switch (tenth) {
			case 2:
				first = "twenty-";
				break;
			case 3:
				first = "thirty-";
				break;
			case 4:
				first = "fourty-";
				break;
			case 5:
				first = "fifty-";
				break;
			case 6:
				first = "sixty-";
				break;
			case 7:
				first = "seventy-";
				break;
			case 8:
				first = "eighty-";
				break;
			case 9:
				first = "ninety-";
				break;
			}

			switch (unit) {
			case 1:
				second = "one";
				break;
			case 2:
				second = "two";
				break;
			case 3:
				second = "three";
				break;
			case 4:
				second = "four";
				break;
			case 5:
				second = "five";
				break;
			case 6:
				second = "six";
				break;
			case 7:
				second = "seven";
				break;
			case 8:
				second = "eight";
				break;
			case 9:
				second = "nine";
				break;
			}

		}
		return first + second;
	}

}

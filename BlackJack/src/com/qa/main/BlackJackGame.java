package com.qa.main;

public class BlackJackGame {

	public int game(int first, int second) {
		int differenceInFirst = 21 - first;
		int differenceInSecond = 21 - second;

		if (differenceInFirst < 0 && differenceInSecond < 0) {
			return 0;
		} else if (differenceInFirst < 0 && differenceInSecond > 0) {
			return second;
		} else if (differenceInFirst > 0 && differenceInSecond < 0) {
			return first;
		} else {
			if (differenceInFirst < differenceInSecond) {
				return first;
			} else {
				return second;
			}
		}
	}

}

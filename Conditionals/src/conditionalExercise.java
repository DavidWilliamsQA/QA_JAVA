
public class conditionalExercise {

	public int multiplyOrAdd(int first, int second, boolean third) {
		if (first % 2 == 0 || second % 2 == 0) {
			return 0;
		} else {
			if (third) {
				return first + second;
			} else {
				return first * second;
			}
		}

	}

}

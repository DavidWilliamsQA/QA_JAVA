
public class Maths {

	public int Addition(int first, int second) {
		return first + second;
	}
	
	public int Multiplication(int first, int second) {
		return first * second;
	}
	
	public int Subtraction(int first, int second) {
		return first - second;
	}
	
	public double Division(double first, double second) {
		if (first < second) {
			return first / second;
		}
		else {
			return 0;
		}
	}
	
}
	
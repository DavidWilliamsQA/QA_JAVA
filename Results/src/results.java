
public class results {

	double total;
	double percentage;

	public void ExamResults(double Physics, double Chemistry, double Biology) {

		System.out.println("Physics: " + Physics);
		System.out.println("Chemistry: " + Chemistry);
		System.out.println("Biology: " + Biology);

	}

	public void ExamPercentages(double Physics, double Chemistry, double Biology) {

		total = Physics + Chemistry + Biology;
		percentage = (total * 100) / 450;

		if (percentage < 60 || Physics < 60 || Chemistry < 60 || Biology < 60) {
			System.out.println("Failed this exam with a percentage of: " + percentage);
		} else {
			System.out.println("the percentage is " + percentage);
		}
	}

}


public class Runner {

	public static void main(String[] args) {

		double physicsResult = 120;
		double chemistryResult = 45;
		double biologyResult = 81;

		results result = new results();

		result.ExamResults(physicsResult, chemistryResult, biologyResult);
		result.ExamPercentages(physicsResult, chemistryResult, biologyResult);

	}

}

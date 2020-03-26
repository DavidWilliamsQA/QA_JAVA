
public class Runner {

	public static void main(String[] args) {
		flowchart flow = new flowchart();
		conditionalExercise exercise = new conditionalExercise();
		flow.flow(2045);
		int test = exercise.multiplyOrAdd(3, 27, false);
		System.out.println(test);

	}

}

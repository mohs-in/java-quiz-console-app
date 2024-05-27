public class QuestionService {
	Question[] questions = new Question[5];

	public QuestionService() {
		questions[0] = new Question(1, "Best Language?", "Java", "C++", "Javascript", "Python", "C");
		questions[1] = new Question(2, "Qualification?", "UG", "PG", "PHD", "12th", "B");
		questions[2] = new Question(3, "Mail Service?", "Twitter", "Facebook", "Drive", "Outlook", "D");
		questions[3] = new Question(4, "Scientific name of Gold?", "Au", "Ua", "Gd", "ol", "A");
		questions[4] = new Question(5, "Scientific name of Copper?", "Ir", "Cr", "Cu", "Co", "C");
	}

	
	public void displayQuestion() {
		for(Question q:questions) {
			System.out.println("Question: " + q.getId() + "\n" + q.getQuestion());
			System.out.println("Option A: " + q.getOpt1() + " | Option B: " + q.getOpt2() + " | Option C: " + q.getOpt3() + " | Option D: " + q.getOpt4() );
		}
	}
}

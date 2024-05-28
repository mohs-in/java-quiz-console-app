import java.util.Scanner;

public class QuestionService {
	Question[] questions = new Question[5];
	Scanner sc = new Scanner(System.in);
	String answers[] = new String [5];
	int score = 0;

	public QuestionService() {
		questions[0] = new Question(1, "NOT a Javascript framework/library?", "Next", "Pandas", "Angular", "React", "B");
		questions[1] = new Question(2, "File Transfer Protocol?", "HTTP", "UDP", "TP", "FTP", "D");
		questions[2] = new Question(3, "Mail Service?", "Twitter", "Facebook", "Outlook", "Drive", "C");
		questions[3] = new Question(4, "Scientific name of Gold?", "Au", "Ua", "Gd", "ol", "A");
		questions[4] = new Question(5, "Scientific name of Copper?", "Ir", "Cr", "Cu", "Co", "C");
	}

	
	public void displayQuestion() {
		int i=0;
		for(Question q:questions) {
			System.out.println("Question: " + q.getId() + "\n" + q.getQuestion());
			System.out.println("Option A: " + q.getOpt1() + " | Option B: " + q.getOpt2() + " | Option C: " + q.getOpt3() + " | Option D: " + q.getOpt4() );
			answers[i] = sc.nextLine();
			i++;
		}
	}

	public void displayAnswers() {
		System.out.println("Let's check how many you got right!!!");
		for(int i=0; i<questions.length; i++) {
			System.out.println("Your Option: " + answers[i].toUpperCase() + " | Correct: " + questions[i].getAnswer());
		}
	}

	public void evaluateScore() {
		for(int i=0; i<questions.length; i++) {
			if(questions[i].getAnswer().equals(answers[i].toUpperCase()))
				score++;
		}

		System.out.println("Score: " + score);
	}
}

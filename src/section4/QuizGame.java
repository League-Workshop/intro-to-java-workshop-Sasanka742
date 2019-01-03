package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;

		// 2. Ask the user a question
		String quest1 = JOptionPane.showInputDialog("Who is the founder of Microsoft?");
		String quest2 = JOptionPane.showInputDialog("Who is the founder of Apple?");
		String quest3 = JOptionPane.showInputDialog("Who is the founder of Tesla?");

		// 3. Use an if statement to check if their answer is correct
		if (quest1.equals("Bill Gates")) {
			score = score + 1;
			// 4. if the user's answer is correct

			// -- add one to their score
		}
		if (quest2.equals("Steve Jobs")) {
			score = score + 1;
		}
		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		if (quest3.equals("Elon Musk")) {
			score = score + 1;
		}
		// 6. After all the questions have been asked, print the user's score
		System.out.println(score);
	}
}

import java.io.*; //load all classes available in this directory.
import java.util.ArrayList;
import java.util.Scanner;

public class OneQuestion
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		Question ask = new Question();
		ask.setQuestionText("What is the best soccer team?");
		ask.setAnswer("Barcelona F.C.");

		ask.display();
		System.out.println("Type your answer now: ");
		String response = in.nextLine();
		System.out.println(ask.checkAnswer(response));
	}
}
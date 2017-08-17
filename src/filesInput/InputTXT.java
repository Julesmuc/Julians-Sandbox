package filesInput;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class InputTXT {
	private static Scanner systemInput;
	private static Scanner fileInput;
	public static void main(String[] args) {
		File inputFile = new File("answers.txt");
		ArrayList<String> answers = new ArrayList<String>();
		String answer, response = "y";
		Random rand = new Random();
		try {
			// create an array list from all lines of a file
			fileInput = new Scanner(inputFile);
			while(fileInput.hasNextLine()) {
				answer = fileInput.nextLine();
				answers.add(answer);
			}
		} catch (Exception e) {
			System.out.println("The input file \"answers.txt\" was not found.");
			System.out.println(e.toString());
		}
		
		systemInput = new Scanner(System.in);
		while (response.equalsIgnoreCase("y")) {
			System.out.println("Ask every question you want, i will answer you");
			systemInput.nextLine();
			System.out.println(answers.get(rand.nextInt(answers.size())));
			System.out.println("Do you have another question? (y/n)");
			response = systemInput.nextLine();
		}

	}

}

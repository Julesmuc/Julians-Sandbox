package filesInput;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutputTXT {
	private static Scanner fileInput;
	private static Scanner systemInput;
	private static PrintWriter fileOutput;
	public static void main(String[] args) {
		// create txt file in source folder with menu items
		File inputFile = new File("menulist.txt");
		File outputFile = new File("menulistprices.txt");
		String menuItem;
		double prices;

		try {
			fileInput = new Scanner(inputFile);
			fileOutput =new PrintWriter(outputFile);
			systemInput = new Scanner(System.in);
			while(fileInput.hasNextLine()){
				menuItem= fileInput.nextLine();
				System.out.println("what is the price for " + menuItem + "?");
				prices = systemInput.nextDouble();
				systemInput.nextLine();
				fileOutput.print(menuItem);
				fileOutput.print("\t");
				fileOutput.print(prices);
				fileOutput.println("\n");

			}
			fileOutput.close();
			System.out.println("menulist with prices was successfully created");
		}
		catch(Exception e)
		{
			System.out.println("The input file \"menulist.txt\" was not found.");
			System.out.println(e.toString());
		}

	}

}
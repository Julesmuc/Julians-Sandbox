package filesInput;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class OutputTXT {
private static Scanner fileOutput;
	public static void main(String[] args) {
		fileOutput = new Scanner(System.in);
		File outputFile = new File ("namelist.txt");
		String name;
		System.out.println("Enter the first name");
		name=fileOutput.nextLine();
		try {
			PrintWriter out = new PrintWriter(outputFile);
			while (name.equalsIgnoreCase("quit")==false) {
				out.println(name);
				System.out.println("Enter next name or write 'quit' to exit");
				name= fileOutput.nextLine();
				
			}
			out.close();
		} catch (Exception e) {
		System.out.println("Error encountered " + e.toString());
		}
	}

}

/**
 * 
 */
package test.example.objects;

import java.util.Scanner;

/**
 * @author Julian Schroeter
 *
 */
public class BuildingStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//Bad way of building new strings (String concatenation)
		String s1 = "Hello";
		String s2 = "Julian";
		String s3 = s1 + ", " + s2 + "!";
		System.out.println(s3);

		//		Smart way of merging strings
		StringBuilder sB = new StringBuilder("Hello")
				.append(", ")
				.append("Julian")
				.append("!");
		System.out.println(sB);

// the scanner scans the output with "in"
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in) ;
		System.out.print("Enter value: ");
		String input = scanner.nextLine();
		
		System.out.println(input);
		
		sB.delete(0, sB.length());
		for (int i = 0; i < 3; i++) {
			input = scanner.nextLine();
			sB.append(input + "\n");
		}
		System.out.println(sB.toString());
	}

}

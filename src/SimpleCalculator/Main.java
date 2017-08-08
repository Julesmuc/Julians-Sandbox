/**
 * 
 */
package SimpleCalculator;

import java.util.Scanner;

/**
 * @author Julian Schroeter
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] matchesplus = new String[] {
				"+",
				"plus"
		};
		String[] matchesminus = new String[] {
				"-",
				"minus"
		};
		String[] matchesdivide = new String[] {
				"/",
				"divide"
		};
		String[] matchesmultiply = new String[] {
				"*",
				"times",
				"multiply"
		};
		try(Scanner scanner = new Scanner(System.in)) {

			System.out.println("Enter first number: ");
			String in1 = scanner.nextLine();
			double d1 = Double.parseDouble(in1);

			System.out.println("Enter second number: ");
			String in2 = scanner.nextLine();
			double d2 = Double.parseDouble(in2);

			System.out.println("Enter your operator: ");
			String in3 = scanner.nextLine().toLowerCase();
			for (String s : matchesplus)
			if(in3.contains(s)) {
				double	 res = d1 + d2;
				System.out.println("Your calculation is: " + res);
				return;
			}
			for (String s : matchesminus)
			if(in3.contains(s)) {
				double	 res = d1 - d2;
				System.out.println("Your calculation is: " + res);
				return;
			}
			for (String s : matchesdivide)
			if(in3.contains(s)) {
				double	 res = d1 / d2;
				System.out.println("Your calculation is: " + res);
				return;
			}
			for (String s : matchesmultiply)
			if(in3.contains(s)) {
				double	 res = d1 * d2;
				System.out.println("Your calculation is: " + res);
				return;
			} else {
				System.out.println("sorry, i don´t know what " + in3 + " is" );
				
				//TODO: add in3 input to a file and automatically add them to the right array with  a question like: what did you want to calc with that input?
			}
		}
	}
}

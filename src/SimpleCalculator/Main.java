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

			double d1 = 0;
			String in1 = "0";
			try {
				System.out.println("Enter first number: ");
				 in1 = scanner.nextLine();
				d1 = Double.parseDouble(in1);
			} catch (NumberFormatException e) {
				System.out.println( in1 +" is not a number!" );
			}

			double d2 = 0;
			String in2 = "0";
			try {
				System.out.println("Enter second number: ");
				 in2 = scanner.nextLine();
				d2 = Double.parseDouble(in2);
			} catch (NumberFormatException e) {
				System.out.println(in2 + " is not a number!" );
			}

			System.out.println("Enter your operator: ");
			String in3 = scanner.nextLine().toLowerCase();
			for (String s1 : matchesplus)
			if(in3.contains(s1)) {
				double	 res = d1 + d2;
				System.out.println("Your calculation is: " + res);
				return;
			}
			for (String s2 : matchesminus)
			if(in3.contains(s2)) {
				double	 res = d1 - d2;
				System.out.println("Your calculation is: " + res);
				return;
			}
			for (String s3 : matchesdivide)
			if(in3.contains(s3)) {
				double	 res = d1 / d2;
				System.out.println("Your calculation is: " + res);
				return;
			}
			for (String s4 : matchesmultiply)
			if(in3.contains(s4)) {
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

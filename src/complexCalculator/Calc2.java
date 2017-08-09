package complexCalculator;

import java.util.Scanner;

public class Calc2 {
	static double d1 = 0;
	static String in1 = "0";

	public static void main(String[] args) {
		double number1 = getNumberInput("Enter your first number: ");
		double number2 = getNumberInput("Enter your second number: ");
		String operator = getInput("Enter your operator: ");

		double result = 0; 

		try {

			switch (operator) {
			case "+":
			case "plus":
				result = addNumbers(number1, number2);
				break;

			case "-":
			case "minus":
				result = substractNumbers(number1, number2);
				break;


			case "/":
			case "divide":
			case "division":
			case "teilen":
			case "teilung":
				result = divideNumbers(number1, number2);
				break;
			case "*":
			case "multiply":
			case "mal":
			case "malnehmen":
			case "Multiplikation":
				result = multiplyNumbers(number1, number2);
				break;
			default:
				System.out.println("Sorry, i don´t know what " + operator + " means");
				return;
			}
			System.out.println("your calculation is: " + result);

		} catch (Exception e) {
			System.out.println("Problem with calculation, code: " + e.getMessage());
		}
	}

	private static double getNumberInput(String string)  {
		System.out.println(string);
		try {
			Scanner sc = new Scanner(System.in);
			in1=sc.nextLine();
			d1 = Double.parseDouble(in1);

		} catch (NumberFormatException e) {
			System.out.println(in1 +" is not a number!");
		}
		return  d1;
	}

	private static String getInput(String string)  {
		System.out.println(string);
		Scanner sc = new Scanner(System.in); 
		return sc.nextLine();
	}
	private static double addNumbers(Double number1, Double number2) {

		return number1 + number2;
	}
	private static double substractNumbers(Double number1, Double number2) {

		return number1 - number2;
	}
	private static double divideNumbers(Double number1, Double number2) {
		return number1 / number2;
	}
	private static double multiplyNumbers(Double number1, Double number2) {
		return number1 * number2;
	}
}

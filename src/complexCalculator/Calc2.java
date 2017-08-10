package complexCalculator;

import complexCalculator.utilities.InputHelper;
import complexCalculator.utilities.MathCalculations;

public class Calc2 {
	
	static double result = 0;
	
	public static void main(String[] args) {
		// Creating an instance of the Calc2 class
		Calc2 calc = new Calc2(); 
		calc.calculate();
	}
	//calculate is an instance method
	protected void calculate() {
		double number1 = InputHelper.getNumberInput("Enter your first number: ");
		double number2 = InputHelper.getNumberInput("Enter your second number: ");
		String operator = InputHelper.getInput("Enter your operator: ");

		try {

			switch (operator) {
			case "+":
			case "plus":
				result = MathCalculations.addNumbers(number1, number2);
				break;

			case "-":
			case "minus":
				result = MathCalculations.substractNumbers(number1, number2);
				break;
			case "/":
			case "divide":
			case "division":
			case "teilen":
			case "teilung":
				result = MathCalculations.divideNumbers(number1, number2);
				break;
			case "*":
			case "multiply":
			case "mal":
			case "malnehmen":
			case "multiplikation":
				result = MathCalculations.multiplyNumbers(number1, number2);
				break;
			default:
				System.out.println("Sorry, i don�t know what " + operator + " means");
				return;
			}
			System.out.println("your calculation is: " + result);
		} catch (Exception e) {
			System.out.println("Problem with calculation, code: " + e.getMessage());
		}
	}
}

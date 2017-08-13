package calculators.complexCalculator.utilities;

import java.util.Scanner;

public class InputHelper {

	static double d1 = 0;
	static String in1 = "0";
	
	@SuppressWarnings("resource")
	public static double getNumberInput(String string)  {
		System.out.println(string);
		try {
			Scanner sc = new Scanner(System.in);
			in1=sc.nextLine();
			d1 = Double.parseDouble(in1);

		} catch (NumberFormatException e) {
			System.out.println(in1 +" is not a number! Error " + e.getMessage());
		}
		return  d1;
	}

	@SuppressWarnings("resource")
	public static String getInput(String string)  {
		System.out.println(string);
		Scanner sc = new Scanner(System.in); 
		return sc.nextLine().toLowerCase();
	}
}

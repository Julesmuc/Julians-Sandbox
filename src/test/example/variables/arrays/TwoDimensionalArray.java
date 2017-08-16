package test.example.variables.arrays;

import java.util.Scanner;

public class TwoDimensionalArray {
	private static Scanner in;
	public static void main(String[] args) {
		
		String[][] states = new String[3][2];
		states[0][0] = "Bayern";
		states[0][1] = "München";
		states[1][0] = "Baden-Württemberg";
		states[1][1] = "Stuttgart";
		states[2][0] = "Hessen";
		states[2][1] = "Wiesbaden";
		
		for (int i = 0; i < states.length; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append("die Hauptstadt von ")
				.append(states[i][0])
				.append(" ist ")
				.append(states[i][1])
				.append(".");
			System.out.println(sb);
		}
		in = new Scanner(System.in);
		int number = 0;
		double[][] prices = new double[5][2];
		for (int i = 0; i < prices.length; i++) {
			number++;
			System.out.println("enter orignal price for item " + number);
			prices[i][0]=in.nextDouble();
			prices[i][1]=prices[i][0] * .70;
		}
		for (int i = 0; i < prices.length; i++) {
			System.out.println("original price for item "+ (i+1) +" was "+prices[i][0]+ "\t discounted price is " + prices[i][1]);
		}
	}

}

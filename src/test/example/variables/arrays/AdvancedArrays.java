package test.example.variables.arrays;

import java.util.Scanner;

public class AdvancedArrays {
	
	private static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int numStudents ;
		double[] heights;
		int number = 0;
		int numberStudent = 0;
		double totalHeights= 0;
		double maxHeight;
		System.out.println("how many student are in the class?");
		numStudents = in.nextInt();
		heights = new double[numStudents];
		for (int i = 0; i < numStudents; i++) {
			number ++;
			System.out.println("Enter height off student number " + number);
			heights[i]  =in.nextDouble();
		}
		//who is the tallest student?
		maxHeight = heights[0];
		for (int i = 1; i < heights.length; i++) {
			
			if(maxHeight < heights[i]) {
				maxHeight = heights[i];
				numberStudent = i+1;
			}
		}
		for (int i = 0; i < heights.length; i++) {
			totalHeights += heights[i];
		}
		System.out.println("the tallest student is number " + numberStudent + " with " + maxHeight + "cm");
		System.out.println("average height of the class is " + (totalHeights/numStudents) + "cm");
		System.out.println("total height of the class is " + totalHeights + "cm");
	}

}

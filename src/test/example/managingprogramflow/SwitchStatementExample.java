package test.example.managingprogramflow;

import java.util.Scanner;

public class SwitchStatementExample {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number...:");
		String input = sc.nextLine();
		int monthNumber = Integer.parseInt(input);
		
		switch (monthNumber) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		default:
			System.out.println("You chose the wrong month");
			
		}
	}

}

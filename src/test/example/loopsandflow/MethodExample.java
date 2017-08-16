package test.example.loopsandflow;

import java.util.Scanner;

public class MethodExample {
	static String[] months= {
			"jan", "feb", "mar", "apr", "may", "jun",
			"jul", "aug", "sep", "oct", "nov", "dec"	
	};
	private static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		double x,y,z;
		int x1,y2,z2;
		double avg = 0;
		double avg2 = 0;
		System.out.println("GIMME 3 NUMBERS");
		x=in.nextDouble();
		y=in.nextDouble();
		z=in.nextDouble();
		avg = average(x,y,z);
		
		
		loopIt("Months of the year");
		loopIt("Again");
		loopIt("... and again");
		
		System.out.println("YOUR AVERAGE IS: " + avg);
		System.out.println("");
		System.out.println("GIMME 3 NUMBERS AGAIN");
		x1=in.nextInt();
		y2=in.nextInt();
		z2=in.nextInt();
		avg2 = averageMe(x1,y2,z2);
		System.out.println("YOUR AVERAGE IS: " + avg2);
	}
	// no data type specified, so i don´t need return
	static void loopIt(String label) {
		System.out.println(label);
		for (int i = 0; i < label.length(); i++) {
			System.out.print("*");
		}
		System.out.println("");
		for (int i=0 ; i < months.length; i++) {
			System.out.println(months[i]);	
		}
	}
	
	public static double average(double num1, double num2, double num3) {
		double avg = (num1 + num2 + num3)/3;
		return avg;
	}
	
	public static double averageMe(int x1, int y2, int z2) {
		//implicit conversion
		return  (x1+y2+z2)/3.0 ;
	}
}

package test.example.loopsandflow;

import java.util.Scanner;

public class SimpleIfElse {
	
	private static Scanner in;
	
	public static void main(String[] args) {
		// Include shipping rates
		double totalsale = 0;
		double shippingrate=0;
		in = new Scanner(System.in);
		System.out.println("Enter total amount");
		totalsale = in.nextDouble();
		if (totalsale>55  && totalsale<75) {
			shippingrate=5;
		} else if (totalsale>25  && totalsale<55) {
			shippingrate=10;
		}
		else if (totalsale<25) {
			shippingrate=15;
		}
		else {
			shippingrate= 0 ; 
		}
		System.out.println("your shippingrate is:" + shippingrate);
	}

}

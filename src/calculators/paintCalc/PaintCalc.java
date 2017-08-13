package calculators.paintCalc;

import java.util.Scanner;

public class PaintCalc {

	private static Scanner in;

	public static void main(String[] args) {
		double length, width, height;
		double window, door = 0;
		double windowlength, doorlength;
		double windowwidth, doorwidth;
		double totalpaint= 0;
		in = new Scanner(System.in);
		System.out.println("Type in LENGTH:" );
		length=in.nextDouble();
		System.out.println("Type in width:" );
		width=in.nextDouble();
		System.out.println("Type in height:" );
		height=in.nextDouble();
		System.out.println("Type in number of windows:" );
		window=in.nextDouble();
		System.out.println("Type in windowlength:" );
		windowlength=in.nextDouble();
		System.out.println("Type in windowwidth:" );
		windowwidth=in.nextDouble();
		System.out.println("Type in number of doors:" );
		door=in.nextDouble();
		System.out.println("Type in doorlength:" );
		doorlength=in.nextDouble();
		System.out.println("Type in doorwidth:" );
		doorwidth=in.nextDouble();
		
		
		totalpaint= (width*height*2 +length*height*2) - (window*windowwidth*windowlength +door*doorlength*doorwidth);
		System.out.println("The whole surface is: " +totalpaint);
		
		
}
	
}

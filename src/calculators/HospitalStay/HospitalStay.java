package calculators.HospitalStay;

import java.util.Scanner;

public class HospitalStay {
	
	private static Scanner in;
	
	public static void main(String[] args) {
		double medcharge, labcharge, nightcharge = 0;
		int staydays;
		double staycharge = 0;
		double totalMoney = 0;
		String again = "", name =""; 
		in = new Scanner(System.in);
		
		do {
			System.out.println("What is the name of the patient?");
			name = in.next();
			System.out.println("How many days did " + name + " stay?");
			staydays = in.nextInt();
			if (staydays == 1 || staydays == 0 ) {
				System.out.println("Did " + name + " stay for the night? (y/n)");
				again=in.next();
				if (again == "y") {
					System.out.println("What is the overnight stay charge?");
					nightcharge = in.nextDouble();
					loopIt("overall charge for staying is: " + overnight(staydays, nightcharge));
			}
				
			} else {
				System.out.println("What is the overnight stay charge?");
				nightcharge = in.nextDouble();
				loopIt("overall charge for staying is: " + overnight(staydays, nightcharge));
			}
			System.out.println("What is the over all med charge?");
			medcharge = in.nextDouble();
			System.out.println("What is the over all lab charge?");
			labcharge = in.nextDouble();
			staycharge = overnight(staydays, nightcharge);
			totalMoney = totalcost(medcharge, staycharge, labcharge);
			loopIt("the total cost for " + name + " is: " + totalMoney);
			System.out.println("Do you have another patient?(y/n)");
			again=in.next();
		} while (again.equalsIgnoreCase("y") || again.equalsIgnoreCase("yes"));

	}
	
	public static double totalcost (double y, double z, double x) {
		return y+z+x;
	}
	public static double overnight(double y, double z) {
		return y*z;
	}
	static void loopIt(String label) {
		System.out.println(label);
		for (int i = 0; i < label.length(); i++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}

}

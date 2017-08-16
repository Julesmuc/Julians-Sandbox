package test.example.loopsandflow;

import java.util.Random;

public class LoopCode {

	public static void main(String[] args) {
		String[] months= {
			"jan", "feb", "mar", "apr", "may", "jun",
			"jul", "aug", "sep", "oct", "nov", "dec"	
		};
		
		int die1,die2, countDoubles=0;
		Random rand = new Random();
		//incrementing loop
			for (int i=0 ; i < months.length; i++) {
				System.out.println(months[i]);
			}
			for (int i=months.length-1 ; i >=0; i--) {
				System.out.println(months[i]);
		}
		//for each loop
		for (String month : months) {
			System.out.println(month);
		}
		//while loop
		int counter = 0 ;
		while (counter < months.length) {
			System.out.println(months[counter]);
			counter++;
		}
			
		//do while loop
		int counter1 = 0 ;
	do {
			System.out.println(months[counter1]);
			counter1++;
		} while (counter1 < months.length) ;
		
		//Random number with loop
		for (int i = 0; i < 100; i++) {
			die1 = rand.nextInt(6)+1;
			die2 = rand.nextInt(6)+1;
			if(die1 == die2) {
				countDoubles++;
			}
		}
		System.out.println("The dice had " + countDoubles + " double throws");

}
}

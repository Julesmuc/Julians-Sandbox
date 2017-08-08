package test.example.managingprogramflow;

public class LoopCode {

	public static void main(String[] args) {
		String[] months= {
			"jan", "feb", "mar", "apr", "may", "jun",
			"jul", "aug", "sep", "oct", "nov", "dec"	
		};
		/*//incrementing loop
			for (int i=0 ; i < months.length; i++) {
				System.out.println(months[i]);				
			}
			for (int i=months.length-1 ; i >=0; i--) {
				System.out.println(months[i]);				
		}
		}*/
		
		/*//for each loop
		for (String month : months) {
			System.out.println(month);
		}*/
		/*//while loop
		int counter = 0 ;
		while (counter < months.length) {
			System.out.println(months[counter]);
			counter++;
		}*/
			
		//do while loop
		int counter = 0 ;
		do {
			System.out.println(months[counter]);
			counter++;
		} while (counter < months.length) ;

}
}

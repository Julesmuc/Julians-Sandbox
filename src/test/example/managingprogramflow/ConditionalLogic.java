package test.example.managingprogramflow;

public class ConditionalLogic {

	public static void main(String[] args) {
		int monthNumber = 21 ;
		// variable name has to be put twice after the &&
		if (monthNumber >= 1 && monthNumber <= 3) {
			System.out.println("YEAH, it큦 snowing AF");
		} else if (monthNumber >= 4 && monthNumber <= 6){
			System.out.println("YEAH, it큦 warm AF");
		} else if (monthNumber >= 7 && monthNumber <= 9){
			System.out.println("YEAH, it큦 HOT AF");
		} else if (monthNumber >= 10 && monthNumber <= 12){
			System.out.println("YEAH, it큦 snowing soon!");
		} else {
			System.out.println("Lol, not a real month");
		}
	}

}

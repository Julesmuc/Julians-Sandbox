package test.example.managingprogramflow;

public class MethodExample {
	static String[] months= {
			"jan", "feb", "mar", "apr", "may", "jun",
			"jul", "aug", "sep", "oct", "nov", "dec"	
	};

	public static void main(String[] args) {
		
		loopIt("Months of the year");
		loopIt("Again");
		loopIt("... and again");

	}
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
}

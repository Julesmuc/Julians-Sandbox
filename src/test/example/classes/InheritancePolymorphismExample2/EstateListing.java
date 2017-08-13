package test.example.classes.InheritancePolymorphismExample2;

public class EstateListing {

	public static void main(String[] args) {
		Properties estate = new Properties(1200000, "Villa", 600);
		Properties land = new Properties(100000, "Land", 1000);
		printIt(estate);
		printIt(land);
		estate.setPrice(2000000);
		printIt(estate);
		
	}
	static void printIt(Properties label) {
		System.out.println(label.toNice());
		System.out.println("");
		
	
}
}

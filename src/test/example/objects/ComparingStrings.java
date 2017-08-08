/**
 * 
 */
package test.example.objects;

/**
 * @author Julian Schroeter
 *
 */
public class ComparingStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";

		if (s1==s2) {
			System.out.println("Both strings are the same");
		} else {
			System.out.println("they do not match");
		}
		
		String s3 ="hello";
		if (s1==s3) {
			System.out.println("Both strings are the same");
		} else {
			System.out.println("they do not match");
		}
		
		
		// This example shows that java has not yet compiled s4 and so it will not match
		String p1 = "Hello ";
		String p2 = "World";
		String s4 = p1 + p2;
		String s5 = "Hello World";
		System.out.println(s4);
		System.out.println(s5);
		// better with equals
		if (s4==s5) {
			System.out.println("Both strings are the same");
		} else {
			System.out.println(s4.toString() +" and "+ s5.toString()+ " do not match");
		}
		
		// Compare strings with equals
				String p6 = "Hello ";
				String p7 = "WORLD";
				String s8 = p6 + p7;
				String s9 = "Hello World";
				System.out.println(s8);
				System.out.println(s9);
				//Doesn't care about lower or upper case
				if (s8.equalsIgnoreCase(s9)) {
					System.out.println(s8.toString() +" and "+ s9.toString()+ " are the same");
				} else {
					System.out.println(s8.toString() +" and "+ s9.toString()+ " do not match");
				}
	}

}

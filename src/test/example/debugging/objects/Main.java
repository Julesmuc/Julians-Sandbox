/**
 * 
 */
package test.example.debugging.objects;

/**
 * @author Julian Schroeter
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "This is my String";
		System.out.println(s1);
		
		String s2 = new String("This is also my String :)");
		System.out.println(s2);
		
		String s3 = "Size: ";
		String s4 = "L";
		String s5 = s3 + s4 + ", Quantity: " + 2;
		System.out.println(s5);
		
		char[] chars= {'h', 'e', 'l', 'l', 'o'};
		String s0 = new String(chars);
		System.out.println(s0 + "!");
		/**
		 * how to create an array from a string
		 *
		 */
		
		char[] chars2 = s0.toCharArray();
		for (char c : chars2) {
			System.out.println(c);
			
		}
	}
}

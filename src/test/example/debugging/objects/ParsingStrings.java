/**
 * 
 */
package test.example.debugging.objects;

/**
 * @author Julian Schroeter
 *
 */
public class ParsingStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "Welcome to Munich!";
		System.out.println("Length of string: " + s1.length());
		int pos = s1.indexOf("Munich");
		System.out.println("Position of city: " + pos);
		
		String sub = s1.substring(11);
		System.out.println(sub);
		
		String s2 = "Welcome!         ";
		int len1= s2.length();
		System.out.println(len1);
		String s3 = s2.trim();
		System.out.println(s3.length());
	}

}

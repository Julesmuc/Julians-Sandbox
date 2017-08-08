
package test.example.debugging.objects;

import java.text.NumberFormat;

/**
 * @author Julian Schroeter
 *
 */
public class PrimitivetoStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Creating a String with Helper class*/
		
		int inV = 42;
		String fromInt = Integer.toString(inV);
		System.out.println(fromInt);
		
		boolean boolV = true; 
		String fromBoold= Boolean.toString(boolV);
		
		System.out.println(fromBoold);
		
		long longV = 10_000_000;
		String fromLong = Long.toString(longV);
		System.out.println(fromLong);
		
		
		long longV2 = 99_000_000;
		NumberFormat formatter = NumberFormat.getNumberInstance();
		String formatted = formatter.format(longV2);
		System.out.println(formatted);
	}

}

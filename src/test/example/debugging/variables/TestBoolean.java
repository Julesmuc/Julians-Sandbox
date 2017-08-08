/**
 * 
 */
package test.example.debugging.variables;

/**
 * @author julian
 *
 */
public class TestBoolean {
	static boolean bDef;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean b1 = true; 
		boolean b2 = false;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(bDef);

		boolean b3 = !b1;

		System.out.println(b3);
		
		int inV1 = 0;
		boolean b4= (inV1 !=0);
		System.out.println("inV1 is not zero? " + b4);
		
		String sBoolean = "true";
		boolean parsed = Boolean.parseBoolean(sBoolean);
		System.out.println("did parsing work? " + parsed);
		
		
	}

}

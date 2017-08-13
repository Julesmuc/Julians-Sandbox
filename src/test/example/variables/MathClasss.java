package test.example.variables;

public class MathClasss {

	public MathClasss() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int intV1 = 56;
		int intV2= 42;
		
		int res1= intV1 + intV2;
		System.out.println(res1);
		
		int res2= intV1 - intV2;
		System.out.println(res2);
		
		int res3= intV1 * intV2;
		System.out.println(res3);
		
		double res4= (double) intV1 / intV2;
		System.out.println(res4);
		
		double res5=  (double) intV1 % intV2;
		System.out.println(res5);
		
		double dValue = -3.99999d;
		long rounded = Math.round(dValue);
		System.out.println(rounded);	
		
		double absValue = Math.abs(dValue);
		System.out.println(absValue);
	}

}

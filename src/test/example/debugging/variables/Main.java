package test.example.debugging.variables;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args){	

		double value = .012;
		double sum = value + value + value;
		
		int inValue1 = 58;
		int inValue2= inValue1;
		System.out.println(inValue2);
		
		long longValue1 = inValue1;
		System.out.println(longValue1);
		
		short shortValue1 = (short) inValue1;
		System.out.println(shortValue1);
		
		int inValue3 = 1024;
		byte byteV = (byte) inValue3;
		System.out.println(byteV);
		
		double doubleV =  3.99999d;
		int inValue4 = (int) doubleV;
		System.out.println(doubleV);
		System.out.println(inValue4);
		
		
		System.out.println(sum);
		String strValue = Double.toString(value);
		System.out.println(strValue);
		BigDecimal bigValue = new BigDecimal(strValue);

		BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
		System.out.println(bSum.toString());
	}
};

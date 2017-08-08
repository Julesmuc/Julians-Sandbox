package test.example.objects;

import java.text.NumberFormat;
import java.util.Locale;

public class ConvertNumbersToStrings {

	public static void main(String[] args) {
		Locale locale = new Locale("de", "DE");
		double doubleV = 1_123_345.56;
		
		NumberFormat numF = NumberFormat.getNumberInstance(locale);
		System.out.println("Number: "+ numF.format(doubleV));

		NumberFormat curF = NumberFormat.getCurrencyInstance(locale);
		System.out.println("Currency: "+ curF.format(doubleV));
		
		NumberFormat intF = NumberFormat.getIntegerInstance(locale);
		System.out.println("Integer: "+ intF.format(doubleV));
	}

}

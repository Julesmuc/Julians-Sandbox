package test.example.variables;

public class MaxValues {

	public static void main(String[] args) {
		byte b = 127;
		System.out.println("MaxValues.main()" + b);
		
		if (b < Byte.MAX_VALUE) {
			b++;
			
		}
		
		System.out.println("MaxValues.main()" + b);
	}

}

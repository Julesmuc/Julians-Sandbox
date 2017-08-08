package test.example.debugging.variables;

public class TestCharacterValues {

	public static void main(String[] args) {
	char c1 = '1';
	char c2 = '2';
	char c3 = '3';
	char c4 = '4';
	char c5 = '5';
	System.out.println(c1+c2+c3+c4+c5);
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	System.out.println(c5);
	
	char dollarSign = '\u0024';
	System.out.println(dollarSign);
	
	char a1 = 'a';
	char a2 = 'b';
	char a3 = 'c';
	System.out.print(Character.toUpperCase(a1));
	System.out.print(Character.toUpperCase(a2));
	System.out.println(Character.toUpperCase(a3));
	}
}


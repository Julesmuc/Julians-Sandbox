package test.example.debugging;

public class DebuggingTests {

	public static void main(String[] args) {
		String welcome = "Welcome";
		char[] chars = welcome.toCharArray();
		char lastChar = chars[chars.length];
		System.out.println(lastChar);
	}

}

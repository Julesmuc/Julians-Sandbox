package test.example.debugging;

public class TryCatchExample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String welcome = "Welcome!"; 
		char[] chars = welcome.toCharArray();

		try {
			
			if(chars.length < 10) {
				throw (new Exception("My custom message"));
			}
			
			char lastChar = chars[chars.length - 1];
			System.out.println(lastChar);
			
			String sub = welcome.substring(10);
			
		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println("Problem with array index");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Problem with string index");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}

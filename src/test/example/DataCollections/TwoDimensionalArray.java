package test.example.DataCollections;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		String[][] states = new String[3][2];
		states[0][0] = "Bayern";
		states[0][1] = "München";
		states[1][0] = "Baden-Württemberg";
		states[1][1] = "Stuttgart";
		states[2][0] = "Hessen";
		states[2][1] = "Wiesbaden";
		
		for (int i = 0; i < states.length; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append("die Hauptstadt von ")
				.append(states[i][0])
				.append(" ist ")
				.append(states[i][1])
				.append(".");
			System.out.println(sb);
		}
	}

}

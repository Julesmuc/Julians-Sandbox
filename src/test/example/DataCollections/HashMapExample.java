package test.example.DataCollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map< String, String> map = new HashMap<>();
		
		map.put("Bayern","München");
		map.put("Hessen","Wiesbaden");
		map.put("Sachsen","Dresden");
		System.out.println(map);
		
		map.put("Baden-Württemberg", "Stuttgart");
		System.out.println(map);
		
		String cap = map.get("Hessen");
		System.out.println("Die Hauptstadt von Hessen ist " + cap);
		
		map.remove("Sachsen");
		System.out.println(map);
	}

}

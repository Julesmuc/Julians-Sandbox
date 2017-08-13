package test.example.DataCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		System.out.println("Ordered data");
		List <String> list = new ArrayList <>();

		list.add("Bayern");
		list.add("Baden-Württemberg");
		list.add("Hessen");

		System.out.println("toString() output");
		System.out.println(list);
		System.out.println("");

		System.out.println("ArrayList iterator");
		// in the diamond braces, you have to indicate what kind of data you´re looping on
		Iterator<String> iterator  = list.iterator();
		while (iterator.hasNext()) {
			String value = iterator.next();
			System.out.println(value);
		}
		System.out.println("");

		System.out.println("ArrayList ForEach");
		for (String value : list) {
			System.out.println(value);
		}
		System.out.println("");

		System.out.println("Java 8 specific iteration, method reference");
		list.forEach(System.out::println);
		System.out.println("");

		// how to loop through unordered data
		System.out.println("unordered data");
		Map< String, String> map = new HashMap<>();

		map.put("Bayern","München");
		map.put("Hessen","Wiesbaden");
		map.put("Sachsen","Dresden");
		System.out.println(map);
		System.out.println("");

		System.out.println("HashMap Iterator");
		Set<String> keys=map.keySet();
		Iterator<String> iterator1 = keys.iterator();
		while (iterator1.hasNext()) {
			String string = (String) iterator1.next();
			System.out.println("die Hauptstadt von "+ string + " ist " + map.get(string));
		}
		System.out.println("");

		System.out.println("HashMap ForEach");
		for (String string : keys) {
			System.out.println("die Hauptstadt von "+ string + " ist " + map.get(string));

		}
		System.out.println("");
	}

}

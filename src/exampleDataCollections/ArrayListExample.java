package exampleDataCollections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//generic Notation
		List <String> list = new ArrayList <>();
		// adding items
		list.add("Bayern");
		list.add("Baden-Württemberg");
		list.add("Hessen");
		System.out.println(list);
		
		list.add("Sachsen");
		System.out.println(list);
		// removing items
		list.remove(3);
		System.out.println(list);
		// using items
		String state = list.get(1);
		
		System.out.println("Stuttgart ist die Hauptstadt von " + state);
		//finding items
		int pos = list.indexOf("Hessen");
		System.out.println("Hessen hat die Position "+ pos);
	}
}

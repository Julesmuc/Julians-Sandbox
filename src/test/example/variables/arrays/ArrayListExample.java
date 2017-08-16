package test.example.variables.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ArrayListExample {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
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
	
	
		ArrayList<Property> mls = new ArrayList<Property>() ;
		Property p1 = new Property(1000, "Land", 3.44);
		mls.add(p1);
		p1 = new Property(230000, "Estate", 40,2,3);
		mls.add(p1);
		System.out.println(mls.toString());
		mls.remove(1);
		System.out.println("After: \n" + mls.toString());
	}
	
	}


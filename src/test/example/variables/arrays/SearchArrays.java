package test.example.variables.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchArrays {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		String searchItem = null;
		String again = null;
		boolean found = false;
		ArrayList<String> groceries = new ArrayList<String>();
		groceries.add("Bananas");
		groceries.add("Milk");
		groceries.add("Bread");
		groceries.add("Oil");
		groceries.add("Butter");
		System.out.println("Here is the current list: \n" + 
				groceries.toString());
		do {
			System.out.println("Enter another item");
			searchItem = in.nextLine();
			found=false;
			for(int i = 0; i<groceries.size();i++) {
				
				if(searchItem.equalsIgnoreCase(groceries.get(i))) {
					System.out.println("This item is already in the list.");
					found = true;
				}
			}
			if(found==false) {
				System.out.println("add " +searchItem+"?");
				again=in.nextLine();
				if(again.equalsIgnoreCase("yes")) {
				groceries.add(searchItem);
				System.out.println(searchItem+" added");
				}
			}

			System.out.println("do want to search again?");
			again=in.nextLine();
		} while (again.equalsIgnoreCase("yes"));
		 System.out.println("\nHere is the final list: \n" + groceries.toString());
	}}
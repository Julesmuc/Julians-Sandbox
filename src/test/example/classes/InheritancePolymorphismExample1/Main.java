package test.example.classes.InheritancePolymorphismExample1;

import java.util.ArrayList;
import java.util.List;

import test.example.classes.InheritancePolymorphismExample1.model.Kalamata;
import test.example.classes.InheritancePolymorphismExample1.model.Ligurian;
import test.example.classes.InheritancePolymorphismExample1.model.Olive;

public class Main {

	public static void main(String[] args) {
		
		List<Olive> olives = new ArrayList <> ();
		olives.add(new Kalamata());
		olives.add(new Kalamata());
		olives.add(new Ligurian());
		olives.add(new Ligurian());
		olives.add(new Ligurian());
		olives.add(new Ligurian());
		
		Press press = new OlivePress();
		press.setOil(5);
		int totalOil = press.getOil(olives);
		System.out.println("Total olive oil: " + totalOil);

	}

}

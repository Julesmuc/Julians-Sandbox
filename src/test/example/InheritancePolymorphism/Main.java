package test.example.InheritancePolymorphism;

import java.util.ArrayList;
import java.util.List;

import test.example.InheritancePolymorphism.model.Kalamata;
import test.example.InheritancePolymorphism.model.Ligurian;
import test.example.InheritancePolymorphism.model.Olive;

public class Main {

	public static void main(String[] args) {
		
		List<Olive> olives = new ArrayList <> ();
		olives.add(new Kalamata());
		olives.add(new Kalamata());
		olives.add(new Ligurian());
		olives.add(new Ligurian());
		olives.add(new Ligurian());
		olives.add(new Ligurian());
		
		OlivePress press = new OlivePress();
		int totalOil = press.getOil(olives);
		System.out.println("Total olive oil: " + totalOil);

	}

}

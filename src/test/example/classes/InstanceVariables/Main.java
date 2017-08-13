package test.example.classes.InstanceVariables;

import java.util.ArrayList;
import java.util.List;

import test.example.classes.InstanceVariables.model.Olive;
import test.example.classes.InstanceVariables.model.OliveName;

public class Main {

	public static void main(String[] args) {
		
		List<Olive> olives = new ArrayList <> ();
		olives.add(new Olive(OliveName.KALAMATA, 0x2E0854, 4));
		olives.add(new Olive(OliveName.KALAMATA, 0x2E0854, 4));
		olives.add(new Olive(OliveName.LIGURIAN, 0x000000, 2));
		olives.add(new Olive(OliveName.LIGURIAN, 0x000000, 2));
		olives.add(new Olive(OliveName.LIGURIAN, 0x000000, 2));
		olives.add(new Olive(OliveName.LIGURIAN, 0x000000, 2));
		
		OlivePress press = new OlivePress();
		int totalOil = press.getOil(olives);
		System.out.println("Total olive oil: " + totalOil);

	}

}

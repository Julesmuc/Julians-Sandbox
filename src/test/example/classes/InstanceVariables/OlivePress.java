package test.example.classes.InstanceVariables;

import java.util.List;

import test.example.classes.InstanceVariables.model.Olive;

public class OlivePress {
	
	public int getOil(List<Olive> olives) {
		int totalOil = 0 ;
		for (Olive o : olives) {
			System.out.println(o.getName());
			totalOil += o.crush();
			
		}
		return totalOil;
		
	}
}

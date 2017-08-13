package test.example.classes.InheritancePolymorphismExample1;

import java.util.List;

import test.example.classes.InheritancePolymorphismExample1.model.Olive;

public class OlivePress implements Press{
	
	private int currentOil;
	
	public int getOil(List<Olive> olives) {
		int totalOil = currentOil ;
		for (Olive o : olives) {
//			System.out.println(o.getName());
			totalOil += o.crush();
			
		}
		return totalOil;
		
	}

	@Override
	public void setOil(int oil) {
		currentOil=oil;
		
	}
}

package test.example.InheritancePolymorphism.model;

public class Ligurian extends Olive{
	public Ligurian() {
		super(OliveName.LIGURIAN,OliveColor.BLACK, 4);
	}

	@Override
	public String getOrigin() {
		// TODO Auto-generated method stub
		return "Italy";
	}

}

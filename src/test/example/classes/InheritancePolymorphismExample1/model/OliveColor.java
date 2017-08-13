package test.example.classes.InheritancePolymorphismExample1.model;

public enum OliveColor {

	PURPLE("Purple", 0x2E0854 ), BLACK("Black", 0x000000 ), GREEN("Green", 0x0FF00) ;
	
	String name;
	long color;
	
	OliveColor(String name, long color ){
		this.name=name;
		this.color=color;
	}
	@Override
	public String toString() {
		return name;
	}
	
}

package test.example.InheritancePolymorphism.model;

public enum OliveName {
	KALAMATA("Kalamata"), LIGURIAN("Ligurian");
	
	private String name;
	
	OliveName(String name){
		this.name = name;	
	}
	
	@Override
	public String toString() {
		
		return name;
	}
}

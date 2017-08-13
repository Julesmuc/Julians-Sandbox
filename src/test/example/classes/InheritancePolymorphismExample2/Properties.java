package test.example.classes.InheritancePolymorphismExample2;

public class Properties {
	private double askingprice;
	private String propertyType;
	private double lotSize;
	private int numBaths ;
	private int numBeds ;
	
	public Properties(double askingprice, String propertyType, double lotSize ) {
		this.askingprice = askingprice;
		this.propertyType =propertyType;
		this.lotSize=lotSize;
		numBaths=0;
		numBeds=0;
	}
	public Properties(double askingprice, String propertyType, double lotSize, int numBaths, int numBeds ) {
		this.askingprice = askingprice;
		this.propertyType =propertyType;
		this.lotSize=lotSize;
		this.numBaths=numBaths;
		this.numBeds=numBeds;
	}
	
	public String toNice() {
		return "Asking price:" + askingprice + 
				"€" +
				"\nProperty Type:  " + propertyType + 
				"\nLot Size: " + lotSize + 
				"m²" +
				"\nNumber of baths:" + numBaths + 
				"\nNumber of bedrooms: "+ numBeds ;
 	}
	
	public void setPrice (double newValue) {
		askingprice = newValue;
	}
}

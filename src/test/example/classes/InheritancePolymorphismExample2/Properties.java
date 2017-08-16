package test.example.classes.InheritancePolymorphismExample2;

public class Properties {
	private static double askingprice;
	private static String propertyType;
	private double lotSize;
	private int numBaths ;
	private int numBeds ;
	
	public Properties(double askingprice, String propertyType, double lotSize ) {
		this.setAskingprice(askingprice);
		this.setPropertyType(propertyType);
		this.lotSize=lotSize;
		numBaths=0;
		numBeds=0;
	}
	public Properties(double askingprice, String propertyType, double lotSize, int numBaths, int numBeds ) {
		this.setAskingprice(askingprice);
		this.setPropertyType(propertyType);
		this.lotSize=lotSize;
		this.numBaths=numBaths;
		this.numBeds=numBeds;
	}
	
	public String toNice() {
		return "Asking price:" + getAskingprice() + 
				"€" +
				"\nProperty Type:  " + getPropertyType() + 
				"\nLot Size: " + lotSize + 
				"m²" +
				"\nNumber of baths:" + numBaths + 
				"\nNumber of bedrooms: "+ numBeds ;
 	}
	
	public void setPrice (double newValue) {
		setAskingprice(newValue);
	}
	public static double getAskingprice() {
		return askingprice;
	}
	public void setAskingprice(double askingprice) {
		Properties.askingprice = askingprice;
	}
	public static String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		Properties.propertyType = propertyType;
	}
}

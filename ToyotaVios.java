
public class ToyotaVios extends Car {
	
    private String tireType;
    private double price;
    
    public ToyotaVios (int speed, String color, String tireType, double price) {
    	
    	super(speed,color);
    	this.tireType = tireType;
    	this.price = price;
    	
    	
    }

	public String getTireType() {
		return tireType;
	}

	public void setTireType(String tireType) {
		this.tireType = tireType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}

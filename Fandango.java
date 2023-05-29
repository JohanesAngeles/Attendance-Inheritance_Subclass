
public class Fandango extends Boat {
	
	private String MainSailColor;
	private double price;
	
	public Fandango (int speed, String color, String mainSailColor, double price) {
		
		super (speed,color);
		this.MainSailColor = mainSailColor;
		this.price = price; 
	}

	public String getMainSailColor() {
		return MainSailColor;
	}

	public void setMainSailColor(String mainSailColor) {
		MainSailColor = mainSailColor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}

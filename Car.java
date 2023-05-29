public class Car {
	
   private int speed;
   private String color;
   
   //Constructor
   public Car (int speed,String color) {
	   this.speed = speed;
	   this.color = color;
	     
   }

    public int getSpeed() {
	   return speed;
}

   public void setSpeed(int speed) {
	   this.speed = speed;
}

   public String getColor() {
	   return color;
}

   public void setColor(String color) {
	   this.color = color;
    }

     public void stop() {
    	 System.out.println("Bip Bip Bip" + "\n");
     }
}

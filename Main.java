public class Main {
	
	
	public static void main(String[] args) {
	
		//A.
	   ToyotaVios vios = new ToyotaVios(200,"White","Michelin XM2+", 1.5);
	   //B.
	   U2SpyPlane u2SpyPlane = new U2SpyPlane("U-2", "gray",1960,4,2,103.0);
	   //C.
	   Fandango fandango = new Fandango(20, "White ombre Light Blue", "Marine Blue", 1.3);
	   
	   //(a.)create a subclass of Car class and name it Toyota-VIOS, which has the following properties of
	   //Speed, Color and price and have the method Stop. methods are (tire type and method drive());
	   
   	   System.out.println("Speed: " + vios.getSpeed());
   	   System.out.println("Color: " + vios.getColor());
   	   System.out.println("Tire Type: " + vios.getTireType());
   	   System.out.println("Price: ₱ " + vios.getPrice() + "M");
   	   vios.stop();
   	   
       //(b.) Create a subclass of plane class and name it  U-2 Spy Plan, which has the following properties
   	   //and methods (wing span and method fly)
	
        System.out.println("Model: " + u2SpyPlane.getModel());
        System.out.println("Color: " + u2SpyPlane.getcolor());
        System.out.println("Year: " + u2SpyPlane.getYear());
        System.out.println("Flight Attendant: " + u2SpyPlane.getFA());
        System.out.println("Pilot: " + u2SpyPlane.getPilot());
        System.out.println("Wingspan: " + u2SpyPlane.getWingspan());

        u2SpyPlane.fly();
       
        //(c.) create a subclass of Boat class and name it Fandango, which has the following properties of 
   	    //Speed, Color and price and have the method Stop. methods are (MainSail color and method float());
        System.out.println("Speed: " + fandango.getSpeed());
        System.out.println("Color: " + fandango.getColor());
        System.out.println("Main Sail Color: " + fandango.getMainSailColor());
        System.out.println("Price: ₱" + fandango.getPrice() + "M");
        
        fandango.stop();
    }
}


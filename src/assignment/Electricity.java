package assignment;

public class Electricity {
	public static void main(String[] args) {
		int units = 350;
		   double bill = 0;
	        
	        if(units <= 50){
	            bill = 250;
	            System.out.println("minimum usage");
	        }
	        
	        else if(units <= 100){
	            bill = units*5;
	            System.out.println("moderate usage");
	        }
	        
	        else if(units >100){
	            bill = units*8;
	            System.out.println("high usage");
	        }
	        System.out.println("The Electricity Bill is "+bill);
	}

}

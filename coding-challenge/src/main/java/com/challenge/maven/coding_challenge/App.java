package com.challenge.maven.coding_challenge;


public class App {
    public static void main( String[] args ){
    
    	// Print out Menu:
    	String menu = "Good Coffeez\n\n" +
    			
					  "Coffee Types:\n" +
					  "House Blend\t $1\n" +
					  "Dark Roast\t $1.5\n" +
					  "Robusta\t $2\n" +
					  "Arabica\t $2.5\n\n" +
					  
					  "Coffee Preparation:\n" +
					  "Espresso\t $1\n" +
					  "Latte\t $1.25\n" +
					  "Cappucino\t $1.5\n" +
					  "Macchiato\t $1.75\n" +
					  "Mocha\t $2\n\n" +
					  
					  "Size:\n" +
					  "Standard\t No change\n" +
					  "Child\t x0.75\n"+
					  "Large\t x1.5\n" +
					  "Addict\t x2\n\n" +
					  
					  "Optional Extras: \n" +
					  "Milk\t $1\n" +
					  "Sugar\t $0.25\n" +
					  "Cocoa Powder\t $0.1\n\n";
		
		
		
		System.out.println(menu);
		
		// Check we can access the values/constants of each enum
		double houseBlend = Type.HOUSE_BLEND.getBasePrice();
		Prepare espresso = Prepare.ESPRESSO;
		Size large = Size.LARGE;
		Extra milk = Extra.MILK;
		
		// Create an Order
		Order order1 = new Order(Type.HOUSE_BLEND, Prepare.LATTE, Size.LARGE);
		
		// Add extras to that Order
		order1.addExtra(milk);
		
		// Calculate the total cost of order
		System.out.println(order1.calculateFinalCost());
    	
    
    }
}

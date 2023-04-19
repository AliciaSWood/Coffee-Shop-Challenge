package com.challenge.maven.coding_challenge;

import java.util.ArrayList;

public class Order {

	// List all values our class Order will need
	private Type coffeeType;
    private Prepare preparationStyle;
    private Size coffeeSize;
    
    // And the value it may add
    private ArrayList<Extra> extra;

    public Order(Type coffeeType, Prepare preparationStyle, Size coffeeSize) {
        this.coffeeType = coffeeType;
        this.preparationStyle = preparationStyle;
        this.coffeeSize = coffeeSize;
        this.extra = new ArrayList<>();
    }

    public void addExtra(Extra extra) {
        this.extra.add(extra);
    }

    public double calculateFinalCost() {
        double basePrice = coffeeType.getBasePrice();
        double stylePrice = preparationStyle.getPrice();
        double sizeMultiplier = coffeeSize.getPrice();
        double extrasPrice = extra.stream().mapToDouble(Extra::getPrice).sum();
        		

        double toRound = ((basePrice + stylePrice) * sizeMultiplier) + extrasPrice;
        
        // Uncomment the code below to check
//        System.out.printf("%f - %f - %f - %f", basePrice, stylePrice, sizeMultiplier, extrasPrice);
        
        // Round the number up to 2 decimal points
        return (double) Math.round(toRound * 100)/100;
    };
}

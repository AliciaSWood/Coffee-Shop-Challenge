package com.challenge.maven.coding_challenge;

import java.util.ArrayList;

public class Order {

	private Type coffeeType;
    private Prepare preparationStyle;
    private Size coffeeSize;
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
        		
//        		
//        		reduce(0,(cv, pv) -> cv + pv.getPrice(), Double::sum);

        double toRound = ((basePrice + stylePrice) * sizeMultiplier) + extrasPrice;
//        System.out.printf("%f - %f - %f - %f", basePrice, stylePrice, sizeMultiplier, extrasPrice);
        return (double) Math.round(toRound * 100)/100;
    };
}

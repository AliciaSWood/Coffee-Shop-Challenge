package com.challenge.maven.coding_challenge;

public enum Type {

	// Values/constants for all coffee types. Only getters, no setters
	HOUSE_BLEND("House Blend", 1.0),
    DARK_ROAST("Dark Roast", 1.5),
    ROBUSTA("Robusta", 2.0),
    ARABICA("Arabica", 2.5);

    private final String displayName;
    private final double basePrice;

    Type(String displayName, double basePrice) {
        this.displayName = displayName;
        this.basePrice = basePrice;
    }

    public String getDisplayName() {
        return displayName;
    }

    public double getBasePrice() {
        return basePrice;
    }
	
}

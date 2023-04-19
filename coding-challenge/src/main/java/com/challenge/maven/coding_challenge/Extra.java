package com.challenge.maven.coding_challenge;

public enum Extra {

	// Values/constants for all extra options. Only getters, no setters
	MILK("Milk", 1.00),
	SUGAR("Sugar", 0.25),
	COCO_POWDER("Coco Powder", 0.1);

	private final String name;
	private final double price;

	private Extra(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}

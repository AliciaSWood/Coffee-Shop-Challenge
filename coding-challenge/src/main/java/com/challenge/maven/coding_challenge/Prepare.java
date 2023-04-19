package com.challenge.maven.coding_challenge;

public enum Prepare {

	// Values/constants for all coffee preparation options. Only getters, no setters
	ESPRESSO("Espresso", 1.00),
    LATTE("Latte", 1.25),
    CAPPUCCINO("Cappuccino", 1.50),
    MACCHIATO("Macchiato", 1.75),
    MOCHA("MOcha", 2.00);
	
		private final String name;
		private final double price;

		Prepare(String name, double price) {
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

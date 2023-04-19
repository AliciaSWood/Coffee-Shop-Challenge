package com.challenge.maven.coding_challenge;

public enum Size {

	STANDARD("Standard", 1),
	CHILD("Child", 0.75),
	LARGE("Large", 1.5),
	ADDICT("Addict", 2);

		private final String name;
		private final double price;
		
		private Size(String name, double price) {
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

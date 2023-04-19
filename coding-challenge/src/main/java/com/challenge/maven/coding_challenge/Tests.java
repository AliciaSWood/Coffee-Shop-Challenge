package com.challenge.maven.coding_challenge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Tests {

	@Test
	void includes_Extras() {
		double shouldEqual = 4.38;
		// order1 = $1.00, $1.25, x1.5 + $1.00 = $4.38
		Order order1 = new Order(Type.HOUSE_BLEND, Prepare.LATTE, Size.LARGE);
		order1.addExtra(Extra.MILK);
		
		assertEquals(order1.calculateFinalCost(), shouldEqual);
	}
	
	@Test
	void no_Extras() {
		double shouldEqual = 3.38;
		// order1 = $1.00, $1.25, x1.5 = $3.38
		Order order1 = new Order(Type.HOUSE_BLEND, Prepare.LATTE, Size.LARGE);
		
		assertEquals(order1.calculateFinalCost(), shouldEqual);
	}
	
	@Test
	void several_Extras() {
		double shouldEqual = 4.63;
		// order1 = $1.00, $1.25, x1.5 + $1.00 + 0.25 = $4.63
		Order order1 = new Order(Type.HOUSE_BLEND, Prepare.LATTE, Size.LARGE);
		order1.addExtra(Extra.MILK);
		order1.addExtra(Extra.SUGAR);
		
		assertEquals(order1.calculateFinalCost(), shouldEqual);
	}
	
	@Test
	void random_Test1() {
		double shouldEqual = 3.10;
		// order1 = $2.50, $1.50, x 0.75 + $0.10 = $3.10
		Order order1 = new Order(Type.ARABICA, Prepare.CAPPUCCINO, Size.CHILD);
		order1.addExtra(Extra.COCO_POWDER);
		
		assertEquals(order1.calculateFinalCost(), shouldEqual);
	}
	
	@Test
	void random_Test2() {
		double shouldEqual = 3.50;
		// order1 = $1.50, $1.75, x 1 + $0.25 = $3.50
		Order order1 = new Order(Type.DARK_ROAST, Prepare.MACCHIATO, Size.STANDARD);
		order1.addExtra(Extra.SUGAR);
		
		assertEquals(order1.calculateFinalCost(), shouldEqual);
	}
	
	@Test
	void random_Test3() {
		double shouldEqual = 9.00;
		// order1 = $2.00, $2.00, x 2 + $1.00 = $9.00
		Order order1 = new Order(Type.ROBUSTA, Prepare.MOCHA, Size.ADDICT);
		order1.addExtra(Extra.MILK);
		
		assertEquals(order1.calculateFinalCost(), shouldEqual);
	}
}

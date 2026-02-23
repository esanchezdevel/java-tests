package com.esanchez.devel.patterns.decorator;

public class BLTBurgerDecorator extends BurgerDecorator {
	
	// This class has as parent the abstract class BurgerDecorator, that it's the one that will call to the 
	// original burger createBurger, so we have to pass the burger to the parent in the constructor
	public BLTBurgerDecorator(BurgerWrapper burger) {
		super(burger);
	}
	
	@Override
	public void createBurger() {
		super.createBurger(); // create the original burger
		System.out.println("Add Bacon"); // Add the extra ingredients
		System.out.println("Add Lettuce");
		System.out.println("Add Tomato");
	}
}

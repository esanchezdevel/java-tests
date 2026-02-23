package com.esanchez.devel.patterns.decorator;

public class DecoratorPattern {

	public static void main(String[] args) {
		System.out.println("Decorator Pattern");
		
		BurgerWrapper burger = new Burger(); // create the object for the original burger
		BurgerDecorator blt = new BLTBurgerDecorator(burger); // pass that original burger to the blt decorator
		blt.createBurger(); // it will create the burger calling to the original burger + blt burger, so we add ingredients to the original burger
	}
}

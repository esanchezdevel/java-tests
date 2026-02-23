package com.esanchez.devel.patterns.decorator;

public class Burger implements BurgerWrapper {

	@Override
	public void createBurger() {
		System.out.println("Add bread");
		System.out.println("Add meat");
		System.out.println("Add cheese");
	}
}

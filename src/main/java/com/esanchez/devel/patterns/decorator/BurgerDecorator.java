package com.esanchez.devel.patterns.decorator;

public abstract class BurgerDecorator implements BurgerWrapper {

	private BurgerWrapper burger;
	
	public BurgerDecorator(BurgerWrapper burger) {
		this.burger = burger;
	}
	
	@Override
	public void createBurger() {
		// In this class is where we place the common code for all the decorators. In this case it's just to create
		// the original burger, but it could have more common code, like log traces, save in database, execute some functionality, etc...
		burger.createBurger();
	}
}

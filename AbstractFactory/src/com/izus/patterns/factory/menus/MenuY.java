package com.izus.patterns.factory.menus;

import com.izus.patterns.factory.ingredients.factory.IngredientFactory;

public class MenuY implements Menu {

	private IngredientFactory factory;

	public MenuY(IngredientFactory factory) {
		this.factory = factory;
	}
	
	public void createMenu() {
		System.out.println("Preparing menu Y");
		System.out.println(factory.createIngredientC().getIngredientName());
		System.out.println(factory.createIngredientD().getIngredientName());
	}

}

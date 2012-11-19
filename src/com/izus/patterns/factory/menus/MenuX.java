package com.izus.patterns.factory.menus;

import com.izus.patterns.factory.ingredients.factory.IngredientFactory;

public class MenuX implements Menu {
	
	private IngredientFactory factory;
	
	public MenuX (IngredientFactory factory)
	{
		this.factory = factory;
	}
	
	public void createMenu() {
		System.out.println("Preparing menu X");
		System.out.println(factory.createIngredientA().getIngredientName());
		System.out.println(factory.createIngredientB().getIngredientName());
	}
}

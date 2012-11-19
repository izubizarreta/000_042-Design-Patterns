package com.izus.patterns.factory.stores;

import com.izus.patterns.factory.ingredients.factory.IngredientFactory;
import com.izus.patterns.factory.ingredients.factory.Store1IngredientFactory;
import com.izus.patterns.factory.menus.Menu;
import com.izus.patterns.factory.menus.MenuX;
import com.izus.patterns.factory.menus.MenuY;

public class Store1 implements Store {
	
	IngredientFactory factory = new Store1IngredientFactory ();
	
	public void prepareMenuX ()
	{
			Menu m = new MenuX (factory);
			m.createMenu();
	}
	
	public void prepareMenuY ()
	{
			Menu m = new MenuY (factory);
			m.createMenu();
	}
}

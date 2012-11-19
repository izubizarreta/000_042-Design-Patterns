package com.izus.patterns.factory.ingredients.factory;

import com.izus.patterns.factory.ingredients.AIngredient;
import com.izus.patterns.factory.ingredients.AIngredient1;
import com.izus.patterns.factory.ingredients.BIngredient;
import com.izus.patterns.factory.ingredients.BIngredient1;
import com.izus.patterns.factory.ingredients.CIngredient;
import com.izus.patterns.factory.ingredients.CIngredient1;
import com.izus.patterns.factory.ingredients.DIngredient;
import com.izus.patterns.factory.ingredients.DIngredient1;

public class Store1IngredientFactory implements IngredientFactory {

	@Override
	public AIngredient createIngredientA() {
		return new AIngredient1();
	}

	@Override
	public BIngredient createIngredientB() {
		return new BIngredient1();
	}
	
	@Override
	public CIngredient createIngredientC() {
		return new CIngredient1();
	}

	@Override
	public DIngredient createIngredientD() {
		return new DIngredient1();
	}

}

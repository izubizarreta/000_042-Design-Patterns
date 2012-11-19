package com.izus.patterns.factory.ingredients.factory;

import com.izus.patterns.factory.ingredients.AIngredient;
import com.izus.patterns.factory.ingredients.AIngredient2;
import com.izus.patterns.factory.ingredients.BIngredient;
import com.izus.patterns.factory.ingredients.BIngredient2;
import com.izus.patterns.factory.ingredients.CIngredient;
import com.izus.patterns.factory.ingredients.CIngredient2;
import com.izus.patterns.factory.ingredients.DIngredient;
import com.izus.patterns.factory.ingredients.DIngredient2;

public class Store2IngredientFactory implements IngredientFactory {
	
	@Override
	public AIngredient createIngredientA() {
		return new AIngredient2();
	}

	@Override
	public BIngredient createIngredientB() {
		return new BIngredient2();
	}
	
	@Override
	public CIngredient createIngredientC() {
		return new CIngredient2();
	}

	@Override
	public DIngredient createIngredientD() {
		return new DIngredient2();
	}

}

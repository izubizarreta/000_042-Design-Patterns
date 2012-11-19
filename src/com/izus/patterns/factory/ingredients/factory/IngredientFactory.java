package com.izus.patterns.factory.ingredients.factory;

import com.izus.patterns.factory.ingredients.AIngredient;
import com.izus.patterns.factory.ingredients.BIngredient;
import com.izus.patterns.factory.ingredients.CIngredient;
import com.izus.patterns.factory.ingredients.DIngredient;

/**
 * Factoría de ingredientes. Hay uno por tienda, para elegir sus ingredientes.
 * Luego el menú los mezclará segun la receta.
 * 
 * @author izu
 *
 */
public interface IngredientFactory {
	
	public AIngredient createIngredientA ();
	
	public BIngredient createIngredientB ();
	
	public CIngredient createIngredientC ();
	
	public DIngredient createIngredientD ();
}

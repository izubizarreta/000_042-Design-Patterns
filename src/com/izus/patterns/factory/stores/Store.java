package com.izus.patterns.factory.stores;

/**
 * Tenemos tiendas con menús.
 * Cada menú se prepara igual, con el mismo tipo ingredientes, pero propios de la tienda (inyección de factory). 
 * 
 * @author izu
 *
 */
public interface Store {
	public void prepareMenuX();

	public void prepareMenuY();
}

package com.izus.patterns.factory.menus;

/**
 * Cada menú siempre se prepara igual, lo que cambian son los ingredientes según
 * la factoría.
 * 
 * @author izu
 * 
 */
public interface Menu {
	public void createMenu();
}
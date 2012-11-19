package com.izus.patterns.factory.test;

import org.junit.Test;

import com.izus.patterns.factory.stores.Store;
import com.izus.patterns.factory.stores.Store1;
import com.izus.patterns.factory.stores.Store2;

public class FactoryTest {

	@Test
	public final void testStore1MenuX() {
		Store s1 = new Store1();
		s1.prepareMenuX();
	}

	@Test
	public final void testStore1MenuY() {
		Store s1 = new Store1();
		s1.prepareMenuY();
	}

	@Test
	public final void testStore2MenuX() {
		Store s1 = new Store2();
		s1.prepareMenuX();
	}

	@Test
	public final void testStore2MenuY() {
		Store s1 = new Store2();
		s1.prepareMenuY();
	}
}

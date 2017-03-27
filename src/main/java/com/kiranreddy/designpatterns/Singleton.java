package com.kiranreddy.designpatterns;

public class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton() {
		// private constructor to restrict clients to access constructor
	}

	public static Singleton getInstance() {
		return instance;
	}

}

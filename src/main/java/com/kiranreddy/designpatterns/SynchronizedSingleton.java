package com.kiranreddy.designpatterns;

public class SynchronizedSingleton {
	private static SynchronizedSingleton instance;

	private SynchronizedSingleton() {
		// private constructor to restrict clients to access constructor
	}

	public static synchronized SynchronizedSingleton getInstance() {
		if (instance == null) {
			instance = new SynchronizedSingleton();
		}
		return instance;
	}

}

package com.kiranreddy.designpatterns;

public class DoubleCheckedLockingSingleton {
	private static DoubleCheckedLockingSingleton instance;

	private DoubleCheckedLockingSingleton() {
		// private constructor to restrict clients to access constructor
	}

	public static DoubleCheckedLockingSingleton getInstance() {
		if (instance == null) { //single check
			synchronized (DoubleCheckedLockingSingleton.class) {
				if (instance == null) { //double check
					instance = new DoubleCheckedLockingSingleton();
				}
			}
		}
		return instance;
	}
}

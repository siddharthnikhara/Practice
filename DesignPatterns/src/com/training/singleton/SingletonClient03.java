package com.training.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//program to access singleton through reflection
public class SingletonClient03 {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = null;
		Singleton singleton3 = null;

		Constructor[] constructors = Singleton.class.getDeclaredConstructors();

		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			singleton2 = (Singleton) constructor.newInstance();
			singleton3 = (Singleton) constructor.newInstance();
			System.out.println("instance 1"+singleton1);
			System.out.println("instance 2"+singleton2);
			System.out.println("instance 3"+singleton3);
			break;
		}

	}
}

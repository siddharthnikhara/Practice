package com.training.abstractPattern;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factoryName) {
		if (factoryName.equals("vehicle")) {
			return new SpeedFactory();
		} else if (factoryName.equals("color")) {
			return new ColorFactory();
		}
		return null;
	}

}

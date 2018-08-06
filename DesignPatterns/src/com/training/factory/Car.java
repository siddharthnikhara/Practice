package com.training.factory;

public abstract class Car {
	public static Car getCar(CarName carName) {
		if (carName == CarName.BMW) {
			return new BMW();
		} else if (carName == CarName.AUDI) {
			return new Audi();
		} else if (carName == CarName.JAGUAR) {
			return new Jaguar();
		}
		return null;
	}
	public abstract void drive();

}

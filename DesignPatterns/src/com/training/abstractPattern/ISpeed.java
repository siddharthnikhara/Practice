package com.training.abstractPattern;

public interface ISpeed {
	void speed(int maxSpeed);

	void move();

	void paint(IColor color);
}

class BMW implements ISpeed {
	@Override
	public void speed(int maxSpeed) {
		System.out.println("bmw speed " + maxSpeed);

	}

	@Override
	public void move() {
		System.out.println("car is moving");
	}

	@Override
	public void paint(IColor color) {
		color.paintCar();
		
	}
}

class Truck implements ISpeed {
	@Override
	public void move() {
		System.out.println("truck is moving");

	}

	@Override
	public void speed(int maxSpeed) {
		System.out.println("truck speed " + maxSpeed);

	}

	@Override
	public void paint(IColor color) {
	color.paintCar();
		
	}
}

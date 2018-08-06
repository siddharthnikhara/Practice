package com.training.abstractPattern;

public interface IColor {
	void paintCar();
}

class Red implements IColor {
	@Override
	public void paintCar() {
		System.out.println("Car painitng with red color");

	}
}

class Blue implements IColor {
	@Override
	public void paintCar() {
		System.out.println("painitng with Blue color");

	}
}

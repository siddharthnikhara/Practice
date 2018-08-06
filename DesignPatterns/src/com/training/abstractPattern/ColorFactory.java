package com.training.abstractPattern;

public class ColorFactory extends AbstractFactory {

	@Override
	public ISpeed getVehicle(String vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IColor getColor(String color) {
		if (color.equals("red")) {
			return new Red();
		} else if (color.equals("blue")) {
			return new Blue();
		}
		return null;
	}

}

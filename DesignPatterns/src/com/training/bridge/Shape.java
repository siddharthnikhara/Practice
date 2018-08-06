package com.training.bridge;
//abstract class

//since this reference of the color is kept there

//every shape shall have color
public abstract class Shape {

	private IColor color;

	public Shape(IColor color) {
		this.color = color;
	}

	protected IColor getColor() {
		return color;
	}

	public abstract void applyColor();
}

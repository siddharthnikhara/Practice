package com.training.abstractPattern;

public abstract class AbstractFactory  {
	// here we will have the list of factories to be exposed
	public abstract ISpeed getVehicle(String vehicle);

	public abstract IColor getColor(String color);
}

package com.training.abstractPattern;

public class SpeedFactory extends AbstractFactory {

	@Override
	public ISpeed getVehicle(String vehicle) {
		if(vehicle.equals("BMW")) {
			return new BMW();
		}else if(vehicle.equals("truck")) {
			return new Truck();
		}
		return null;
	}

	@Override
	public IColor getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}

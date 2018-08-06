package com.training.abstractPattern;

public class Client {
	public static void main(String[] args) {
		AbstractFactory vehicleFactory = FactoryProducer.getFactory("vehicle");
		IColor redColor = FactoryProducer.getFactory("color").getColor("red");
		IColor blueColor = FactoryProducer.getFactory("color").getColor("blue");
		ISpeed speedCar = vehicleFactory.getVehicle("BMW");
		speedCar.speed(222);
		speedCar.move();
		speedCar.paint(redColor);
		System.out.println("truck");
		ISpeed manTruck = vehicleFactory.getVehicle("truck");
		manTruck.speed(65);
		manTruck.move();
		manTruck.paint(blueColor);

	}
}

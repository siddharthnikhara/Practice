package com.training.facade;

public class Client {

	public static void main(String[] args) {
		FacadeCar myCar = new FacadeCar();
		myCar.sedanDrive();
		myCar.hatchBackDrive();

		myCar.suvDrive();
	}

}

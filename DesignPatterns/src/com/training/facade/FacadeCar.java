package com.training.facade;

public class FacadeCar {
	private Hatchback hbc;
	private SUV suv;
	private Sedan sedan;

	public FacadeCar() {
		this.hbc = new Hatchback();
		this.sedan = new Sedan();
		this.suv = new SUV();
	}

	public void hatchBackDrive() {
		hbc.drive();
	}

	public void sedanDrive() {
		sedan.drive();
	}

	public void suvDrive() {
		suv.drive();
	}
}

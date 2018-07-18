package com.training.autowire;

public class Camera {

	private String type;
	public Camera() {
	System.out.println("creatin camera"+this);
	}
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Camera [type=" + type + "]";
	}
	
}

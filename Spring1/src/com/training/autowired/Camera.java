package com.training.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("camera")
public class Camera {
	@Value("portrait")
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

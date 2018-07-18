package com.training.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Mobile")
public class Mobile {
	@Autowired(required=false)
	private Camera camera;
	@Autowired(required=false)
	private Screen screen;
	@Autowired(required=false)
	private Speaker speaker;

	public Mobile() {
		System.out.println("creating mobile:" + this);
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

}

package com.training.autowire;

public class Mobile {
	private Camera camera;
	private Screen screen;
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

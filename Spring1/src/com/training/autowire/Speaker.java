package com.training.autowire;

public class Speaker {
	private String type;
	private int volLevels;

	public Speaker() {
		System.out.println("Creating speaker:" + this);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getVolLevels() {
		return volLevels;
	}

	public void setVolLevels(int volLevels) {
		this.volLevels = volLevels;
	}

	@Override
	public String toString() {
		return "Speaker [type=" + type + ", volLevels=" + volLevels + "]";
	}

}

package com.training.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("speaker")
public class Speaker {
	@Value("loud")
	private String type;
	@Value("10")
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

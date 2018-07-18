package com.training.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("screen")
public class Screen {
	@Value("xyz")
	private String glassType;
	@Value("6")
	private int len;
	@Value("3")
	private int bre;

	public Screen() {
		System.out.println("creating screen" + this);

	}

	public String getGlassType() {
		return glassType;
	}

	public void setGlassType(String glassType) {
		this.glassType = glassType;
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public int getBre() {
		return bre;
	}

	public void setBre(int bre) {
		this.bre = bre;
	}

	@Override
	public String toString() {
		return "Screen [glassType=" + glassType + ", len=" + len + ", bre=" + bre + "]";
	}

}

package com.training.autowire;

public class Screen {

	private String glassType;
	private int len;
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

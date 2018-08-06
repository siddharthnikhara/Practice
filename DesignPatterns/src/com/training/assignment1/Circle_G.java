package com.training.assignment1;

public class Circle_G extends Circle {
	@Override
	public void accept(GraphicalObjectVisitor visitor) {
		visitor.visit(this);
	}

}

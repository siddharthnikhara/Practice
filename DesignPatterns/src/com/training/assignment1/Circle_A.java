package com.training.assignment1;

public class Circle_A extends Circle {
	@Override
	public void accept(GraphicalObjectVisitor visitor) {
		visitor.visit(this);
	}

}

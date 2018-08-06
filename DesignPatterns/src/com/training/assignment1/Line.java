package com.training.assignment1;

import com.training.assignment1.CompositeProtocol.Component.Leaf;
import com.training.assignment1.GraphicalObjectVisitor.Visitable;

public class Line extends Leaf implements Visitable {
	@Override
	public void accept(GraphicalObjectVisitor visitor) {
		visitor.visit(this);

	}

	@Override
	public String toString() {
		return "Line []";
	}
	
}

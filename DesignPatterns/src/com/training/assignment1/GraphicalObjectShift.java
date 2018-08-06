package com.training.assignment1;

public class GraphicalObjectShift implements GraphicalObjectVisitor{

	@Override
	public void visit(Point point) {
		System.out.println("visit point" + point);
		
	}

	@Override
	public void visit(Line line) {
		System.out.println("visit line" + line);
		
	}

	@Override
	public void visit(Circle circle) {
		System.out.println("visit circle" + circle);
		
	}

}

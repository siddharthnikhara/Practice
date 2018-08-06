package com.training.assignment1;

public interface GraphicalObjectVisitor {
	void visit(Point point);

	void visit(Line line);

	void visit(Circle circle);

	interface Visitable {
		public void accept(GraphicalObjectVisitor visitor);
	}

}

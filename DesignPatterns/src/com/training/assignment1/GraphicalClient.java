package com.training.assignment1;

import com.training.assignment1.CompositeProtocol.Component;
import com.training.assignment1.CompositeProtocol.Component.Composite;
import com.training.assignment1.CompositeProtocol.Component.Leaf;
import com.training.assignment1.GraphicalObjectVisitor.Visitable;

public class GraphicalClient {
	public static void main(String[] args) {
		Leaf leaf = new Line();
		Composite comp = new ObjectGroup();
		comp.addObject(leaf);
		GraphicalObjectVisitor gov = new GraphicalObjectShift();
		leaf.accept(gov);
	}
}

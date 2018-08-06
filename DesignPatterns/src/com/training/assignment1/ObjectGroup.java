package com.training.assignment1;

import com.training.assignment1.CompositeProtocol.Component.Composite;
import com.training.assignment1.CompositeProtocol.Component.Leaf;
import com.training.assignment1.GraphicalObjectVisitor.Visitable;

public class ObjectGroup extends Composite implements Visitable {


	@Override
	public void accept(GraphicalObjectVisitor visitor) {
	
		
	}

	@Override
	public void addObject(Leaf leaf) {
		System.out.println("component will added......");
		
	}

	@Override
	public void removeObject(Leaf leaf) {
		System.out.println("component will removed......");
		
	}



}

package com.training.assignment1;

import com.training.assignment1.CompositeProtocol.Component.Leaf;
import com.training.assignment1.GraphicalObjectVisitor.Visitable;

public class CompositeProtocol {
	Leaf leaf;

	static class Component {
		private Leaf leaf;

		public Component(Leaf leaf) {
			this.leaf = leaf;
		}

		static class Leaf implements Visitable {
			public Leaf() {
				super();
			}

			@Override
			public void accept(GraphicalObjectVisitor visitor) {
				System.out.println(visitor + "   from leaf class");
			}
		}

		abstract static class Composite {
			public Composite() {
				super();
			}

			abstract public void addObject(Leaf leaf);

			public abstract void removeObject(Leaf leaf);
		}

	}

}

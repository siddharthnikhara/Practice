package com.training.observer;

public class User implements IObserver {
	private IObservable obserable = null;
	private String name;

	// the construtor is mapper b/w the enduser and the notification product
	public User(IObservable obserable, String name) {
		super();
		this.obserable = obserable;
		this.name = name;
	}

	public void buyMobile() {
		System.out.println("hurrrrrrryyyyyyyyyy, ihave bouyght onePlus6t by" + name);
	}

	public void buyMobile1Plus7T() {
		System.out.println("hurrrrrrryyyyyyyyyy, ihave bouyght onePlus7t by" + name);
	}

	@Override
	public void update() {
		if (obserable.equals("OnePlus6T")) {
			buyMobile();
		} else {
			buyMobile1Plus7T();
		}
	}

	public void unSubcribe() {
		obserable.remove(this);
	}

}

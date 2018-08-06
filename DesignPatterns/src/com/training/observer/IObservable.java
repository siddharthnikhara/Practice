package com.training.observer;

public interface IObservable {
	public void addUser(IObserver observer);

	public void remove(IObserver observer);

	public void notifyObserver();

}

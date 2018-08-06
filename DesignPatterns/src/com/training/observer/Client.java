package com.training.observer;

public class Client {
	public static void main(String[] args) {
		IObservable observable = new OnePlus6T();
		IObservable obser = new OnePlus7T();
		
		
		IObserver user1 = new User(observable, "somu");
		IObserver user2 = new User(observable, "sid");
		IObserver user3 = new User(observable, "rohit");
		
		
		IObserver user4 = new User(observable, "anuj");
		IObserver user5 = new User(observable, "goutu");
		IObserver user6 = new User(observable, "tanu");
		
		
		observable.addUser(user1);
		observable.addUser(user2);
		observable.addUser(user3);
		
		obser.addUser(user4);
		obser.addUser(user5);
		obser.addUser(user6);
		((OnePlus6T) observable).setArrived(true);
		
		
		//((OnePlus7T) obser).setArrived(true);
	}

}

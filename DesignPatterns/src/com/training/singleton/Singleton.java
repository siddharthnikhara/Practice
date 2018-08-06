package com.training.singleton;

import java.io.Serializable;

//the singleton says there should be only one object 
//to do so we will have the variable as statiuc so that you can have only
//one reference, in singleton we can have two types
// 1. eager singleton  2. lazy singleton

// (cons for eager singleton ) either the instance is needed or not one copy is always kept in jvm
public class Singleton implements Serializable{
	
	private static final Singleton instance = new Singleton();
	//shall have the private constructor so that it is not accssable outside the class
	
	private Singleton() {
		System.out.println("the constructor is called");
	}
	public static Singleton getInstance() {
		return instance;
	}
	protected Object readResolve() {
		return getInstance();
	}

}

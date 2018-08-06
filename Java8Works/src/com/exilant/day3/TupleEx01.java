package com.exilant.day3;

import java.util.ArrayList;
import java.util.List;

class MyTuple<A, B, C> {
	private A ab;
	private B bb;
	private C cc;

	public MyTuple() {
		// TODO Auto-generated constructor stub
	}

	public MyTuple(A ab, B bb, C cc) {
		super();
		this.ab = ab;
		this.bb = bb;
		this.cc = cc;
	}

	public A getAb() {
		return ab;
	}

	public void setAb(A ab) {
		this.ab = ab;
	}

	public B getBb() {
		return bb;
	}

	public void setBb(B bb) {
		this.bb = bb;
	}

	public C getCc() {
		return cc;
	}

	public void setCc(C cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "MyTuple [ab=" + ab + ", bb=" + bb + ", cc=" + cc + "]";
	}

}
class Emp{}
class Dept{}
class SomeThing{}

public class TupleEx01 {

	public static MyTuple<Integer, String, Boolean> newTuple() {
		return new MyTuple(100, "hello", true);
	}

	
	public static MyTuple<Emp,Dept,SomeThing> newCustomTuple(){
		return new MyTuple(new Emp(),new Dept(), new SomeThing());
		
	}
	public static void main(String[] args) {
		MyTuple<Integer,String,Boolean> tuple1=newTuple();
		System.out.println("Integer value:"+tuple1.getAb());
		System.out.println("String value:"+tuple1.getBb());
		System.out.println("Boolean value:"+tuple1.getCc());
		
		List<MyTuple<Integer,String,Boolean>> myList =  new ArrayList<MyTuple<Integer,String,Boolean>>();
	}

}

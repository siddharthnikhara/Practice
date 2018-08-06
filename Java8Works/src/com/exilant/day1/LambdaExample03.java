package com.exilant.day1;

//this programm to show simple working of functional interface
//if you have an interface and that interface has exactly one abstract method  then that interface can be eligible 
//tp br funvtion interface
@FunctionalInterface
interface MathOperation {
	int operation(int num1, int num2);

}

public class LambdaExample03 {
	public static int operate(int num1, int num2, MathOperation opr) {
		return opr.operation(num1, num2);
	}

	public static void main(String[] args) {
		MathOperation add = (int num1, int num2) -> num1 + num2;
		MathOperation sub = (int num1, int num2) -> num1 - num2;

		System.out.println(operate(10, 20, add));
		System.out.println(operate(50, 20, sub));

		MathOperation m1 = (num1, num2) -> (num1 + num2);
		System.out.println(m1.operation(20, 30));
		
		//same as above 18 line
//		MathOperation add = new MathOperation() {
//			
//			@Override
//			public int operation(int num1, int num2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};
		
		

	}

}

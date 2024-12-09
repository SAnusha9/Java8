package com.anu.java8.lambdaexpression;

interface Calculator{
	//void switchOn();//no parameters 
	//void sum(int input);//with parameter
	int substraction(int i1,int i2);//with multiple parameters
}
public class CalculatorImpl {

	public static void main(String[] args) {
//		Calculator calculator=()->System.out.println("Switch on");
//		calculator.switchOn();

//		Calculator calculator= (input)->System.out.println("Sum :"+input);
//		calculator.sum(279);
		Calculator calculator=(i1,i2)->
		{
			if(i2<i1) {
				throw new RuntimeException("message");
			}else {
				return i2-i1;
			}
		};
		System.out.println(calculator.substraction(10, 20));
}
}

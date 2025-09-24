package com.tandemloop;
import java.util.Scanner;
public class Problem1 {
		 double a,b;
		 String operation;
		 Problem1(double a,double b,String operation){
			 this.a=a;
			 this.b=b;
			 this.operation=operation;
		 }
		 public double calculate() {
				 switch (operation.toLowerCase()) {
				 case "add":
					 return a+b;
				 case "subtract":
					 return a-b;
				 case "multiply":
					 return a*b;
				 case "divide":
					 if(b!=0) {
						 return a/b;
					 }
					 else {
						 throw new ArithmeticException("Division by zero is not allowed");
					 }
					 default:
						 throw new IllegalArgumentException("Invalid operation");
				}
			 }
    public static void main(String[]args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the First value:");
    	double a=sc.nextDouble();
    	System.out.println("Enter the second value:");
    	double b=sc.nextDouble();
    	System.out.println("Enter add,subtract,multiply,divide");
    	String operation=sc.next();
    	Problem1 pro=new Problem1(a,b,operation);
    	double result=pro.calculate();
    	System.out.println("Result="+ result);
    	} 
}

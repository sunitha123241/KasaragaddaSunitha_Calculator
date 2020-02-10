package com.codebind;
import java.util.*;
//Preparing a calculator class in which we define the main class.In the main class we create objects for Add class,Subtract class,Multiplication class,Division class according to the options choosen by the user

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter your choice 1.Addition,2.Subtraction,3.Multiplication,4.Division,5.exit");
		int choice = sc.nextInt();
		int num1 = 0;
		int num2 = 0;
		if(choice!=5)
		{
		System.out.println("Enter two numbers to perform your operation:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		}
		switch(choice) {
		case 1:
			//Add class adds two integer numbers and returns an integer
			Add obj1 = new Add();
			System.out.println("After adding"+num1+" "+num2+"the result is"+obj1.addition(num1,num2));
			break;
		
		case 2:
			//Subtract class subtracts two integer numbers and returns an integers
			Subtract obj2 = new Subtract();
			System.out.println("After subtracting"+num1+" "+num2+"the result is"+obj2.sub(num1,num2));
			break;
		
		case 3:
			//Multiplication class multiplies two integer numbers and returns an integers
			Multiplication obj3 = new Multiplication();
			System.out.println("After multiplication"+num1+" "+num2+"the result is"+obj3.multiply(num1,num2));
			break;
		
		case 4:
			//Division class divides two numers
			Division obj4 = new Division();
			System.out.println("After dividing"+num1+" "+num2+"the result is"+obj4.divide(num1,num2));
			break;
			
		case 5:
			System.exit(0);

			
		
		}
		}
		

	}

}

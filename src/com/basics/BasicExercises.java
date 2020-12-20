package com.basics;

import java.util.Scanner;

public class BasicExercises {

	public static void main(String[] args) {
		
		//1. Print Hello n your name on differnt line
		
		System.out.println("Hello");
		System.out.println("Ashwini Pimple");
		System.out.println("****************************");
		
		//2.Write a Java program to print the sum of two numbers.
		
		int a=74;
		int b=36;
		
		System.out.println("Addition is :"+ (a+b));
		System.out.println("****************************");
		
		//3.Java program to divide two numbers and print on the screen.
		
		int c=50;
		int d=3;
		
		int e=c/d;
		System.out.println("Division is :"+e);
		System.out.println("****************************");
		
		/*
		 * //4.Write a Java program to print the result of the following operations. Go
		 * to the editor //Test Data:
		 *  a. -5 + 8 * 6 
		 *  b. (55+9) % 9 
		 *  c. 20 + -3*5 / 8
		 *  d. 5+ 15 / 3 * 2 - 8 % 3
		 */
		
		
		int l= -5+(8*6);   //-5+48=43
		int m= (55+9) %9;   //64%9=rem=1
		int n=20 + (-3*5) / 8;  //20+(-15)/8 --->20-1=19
		int p=(5 + 15 / 3 * 2 - 8 % 3); //5+(15/3)*2-(8%3)---->5+(5*2)-2--->5+10-2--->15-2--->13

		
		System.out.println(l);
		System.out.println(m);	
		System.out.println(n);
		System.out.println(p);
		System.out.println("****************************");
		
		
		//5.Write a Java program that takes two numbers as input and display the product of two numbers. 
		
		int num1=25;
		int num2=5;
		
		/*
		 * Scanner sc=new Scanner(System.in);
		 * 
		 * System.out.println("Enter firt number"); int num1=sc.nextInt();
		 * 
		 * System.out.println("Enter second number"); int num2=sc.nextInt();
		 */
		System.out.println("Product of numbers: "+(num1*num2));
		System.out.println("****************************");
		
		//6.Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
		
		int num3=125;
		int num4=24;
		
		int add=125+24;
		int sub=125-24;
		int mul=125*24;
		int div=125/24;
		int mod=125%24;
		
		
		System.out.println("Addition is: "+add);
		System.out.println("Subtraction is: "+sub);
		System.out.println("Multiplication is: "+mul);
		System.out.println("Division is: "+div);
		System.out.println("Modulo is: "+mod);
		System.out.println("****************************");
		
		//7.Write a Java program that takes a number as input and prints its multiplication table upto 10.
		
		int number=8;
		
		for(int i=1;i<=10;i++) {
			System.out.println(number+"*"+(i)+"=" +(number*i));
			
		}
		System.out.println("****************************");
		
		//8. Write a Java program to display the following pattern.
		//Sample Pattern :

		  //J    a   v     v  a                                                  
		  //J   a a   v   v  a a                                                 
	//	 J  J  aaaaa   V V  aaaaa                                                
//		  JJ  a     a   V  a     a
	
		System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
        
        System.out.println("****************************");
        
		//9. Write a Java program to compute the specified expressions and print the output.
        
        double a1=((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(a1);
        System.out.println("****************************");
        
        
        //10.Write a Java program to compute a specified formula.
        
        double b1=4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(b1);

        System.out.println("****************************");
        
        //11.Write a Java program to print the area and perimeter of a circle
        double radius= 7.5;
        double circle=3.14*radius*radius;
        
        
	}
}

package com.xworkz.xworkzapp.exceptionevent;

public class ExceptionHandling {
	public String name;

	public static void main(String[] args) {

// int c=0;
		System.out.println("indide the main method");
		/*
		 * The scenario where number cannot be divided by zero and throughs the
		 * arithemetic exception int a=9; int b=0; c=a/b; System.out.println(c);
		 * System.out.println("main method ended");
		 */

		/*
		 * To handle the arithmetic exception we have to use the try and catch the try
		 * and catch are both related to each other and the Arithmetic exception is the
		 * class and catch is a method which has variavle e; try{ int a=8; int b=0;
		 * c=a/b; System.out.println(c); } catch(ArithmeticException e)
		 * e.printStackTrace(); { System.out.println("main method ended");
		 * 
		 * }
		 */
		/*
		 * here we get the null point exception due to the object created and asssigned
		 * to null so we get Nullpointer exception ExceptionHandling
		 * exceptionHandling=null; System.out.println(exceptionHandling.name);
		 */
		/*
		 * null pointer exception is handled try{ExceptionHandling
		 * exceptionHandling=null; // ExceptionHandling exceptionHandling=new
		 * ExceptionHandling(); exceptionHandling.name="baba";
		 * System.out.println(exceptionHandling.name); }catch(NullPointerException e) {
		 * e.printStackTrace();
		 * System.out.println("name is null so we cannot access it");
		 * 
		 * }
		 */
		/*
		 * int a[]= {1,3,4,5,5,5}; System.out.println(a[9]);
		 * System.out.println("array value not assigned");
		 */
		try {
			int a[] = { 1, 2, 3, 4, 5, 6 };
			System.out.println(a[9]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index should be within the size");
			e.printStackTrace();
		}

	}
}

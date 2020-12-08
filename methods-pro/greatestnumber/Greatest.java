package com.xworkz;

public class Greatest {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		{
			int finalValue=maxOfTwoNumbers(89,87);
			System.out.println(finalValue);
		}
		static int maxOfTwoNumbers(int numone, int numtwo)
		{
			if(numone>numtwo)
				return numone;
			else
				return numtwo;
						
		}

	}


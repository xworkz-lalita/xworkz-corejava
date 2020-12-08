package com.xworkz.util;

import java.util.Scanner;

import com.xworkz.cartoon.Cartoon;

public class CartoonUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); //in is a static variable is avilable inside the class System
		System.out.println("enter language"); //scanner
	String language=sc.next(); //scanner
		Cartoon ch=new Cartoon("kannada"); //scanner
		System.out.println(ch.language);

		//Cartoon ck=new Cartoon();
		
		//Cartoon cd=new Cartoon(123232323l,"Doremon");//parameterized constructor, we used hard coded input , we have to provide at run time,scanner helpint to provide values. 
			//Cartoon cm=new Cartoon("hindi");// one parameterized
			//System.out.println(cd.id+" "+cd.name);
			//System.out.println(cm.language);
	
		//Cartoon cs=new Cartoon(53436725l,"Pokemon","Tamil");
		//Cartoon ct=new Cartoon(2313131l,"tom and jerry","English");
		//Cartoon cn=new Cartoon(122222222l,"motu patlu","Kannada");
		//Cartoon co=new Cartoon(98989898l,"heidi","Telugu");
		
		//System.out.println(cs.id+" "+cs.name+" "+cs.language);
		//System.out.println(ct.id+" "+ct.name+" "+ct.language);
		//System.out.println(cn.id+" "+cn.name+" "+cn.language);
		//System.out.println(co.id+" "+co.name+" "+co.language);

	}

}

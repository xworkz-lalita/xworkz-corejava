package com.xworkz.util;

import com.xworkz.church.Church;

public class ChurchUtil {
public static void main(String[] args) {
	Church ch=new Church("st.joseph","jayanagar",12);//constructor initialisation
	//ch.setName("st.Mary church");//setter and getter intialisation
	//ch.setAddress("Goa");
	//ch.setNoOfFathersAndSisters(7);
	System.out.println(ch.getName()+" "+ch.getAddress()+" "+ch.getNoOfFathersAndSisters());
	//System.out.println(ch.name+" "+ch.address+" "+ch.noOfFathersAndSister);
}

}

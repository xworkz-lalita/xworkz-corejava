package com.xworkzz.util;

import com.xworkzz.transport.Transportation;

public class TransUtil {

	public static void main(String[] args) {
		
		Transportation trans= new Transportation();
		            trans.id="L12RE";
		            trans.name=" VRL";
		           // trans.address[0]=" vijayanaga";
		           // trans.address[1]=" mg road";
		            //trans.address[2]=" mejestic";
		            //trans.address[3]=" k r market";
		            //trans.address[4]=" rajajinagar";
		            //trans.address[5]=" rajajinagar";
		            trans.branches=   5;
		            System.out.println(trans.id +""+ trans.name+""+ trans.branches);
		            trans.importAndExport();
		            trans.transport();
		            for(int j=0;j<=5;j++)
		            {
		            	System.out.println(trans.address[j]);
		            }
		            for (int i=0;i<(trans.address).length;i++)
		            {
		            	System.out.println(trans.address[i]);
		            }
		            for (String address:trans.address)
		            {
		            	System.out.println(address);
		            }
		           
		       
	}
}

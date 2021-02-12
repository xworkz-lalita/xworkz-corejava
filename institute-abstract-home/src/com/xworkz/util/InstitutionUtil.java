package com.xworkz.util;
import com.xworkz.xworkzapp.Institute;
import com.xworkz.xworkzapp.OtherInstitute;
import com.xworkz.xworkzapp.Xworkz;

public class InstitutionUtil {
	public static void main(String[] args) {
		Institute institute = new Xworkz();
		institute.education();
		institute.jobs();
		
		Institute in=new OtherInstitute();
		in.education();
		in.jobs();
	
		OtherInstitute spider=new OtherInstitute();
		spider.education();
		
	    spider.jobs();
		
	    Xworkz xworkz=new Xworkz();
	    xworkz.education();
	    xworkz.jobs();
	}

}

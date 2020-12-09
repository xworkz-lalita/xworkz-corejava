package com.dev.devapp.util;

import com.dev.devapp.industry.SteelIndustry;

public class IndustryUtil {
	public static void main(String[] args) {
		SteelIndustry industry =new SteelIndustry();
	industry.setArea("HSR layout");
	industry.setNoOfWorkers(12);
	industry.setType("sales");
		//SteelIndustry industry =new SteelIndustry("Construction",76,"hebbal road");
		//industry.area="Electronic city";
	//	industry.noOfWorkers=543;
		//industry.type="manufacturing";
		System.out.println(industry.getArea()+" "+industry.getNoOfWorkers()+" "+industry.getType());
	}

}

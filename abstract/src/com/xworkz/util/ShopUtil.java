package com.xworkz.util;

import com.xworkz.xworkzapp.Automobile;
import com.xworkz.xworkzapp.Bakery;
import com.xworkz.xworkzapp.Shop;

public class ShopUtil {
	public static void main(String[] args) {
		Shop shop=new Bakery();
		Shop shp=new Automobile();
		shp.serve();
		//shp.Serving();
			shop.serve();
			//shop.Serving();
		
	}

}

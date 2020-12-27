package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.speaker.Speaker;

public class SpeakerUtil {
	public static void main(String[] args) {
		Speaker sp=new Speaker(2000.00,9,"Black");
		System.out.println(Speaker.getBrandName());
		System.out.println(sp.isConnected());
		sp.onOroff();
		//sp.decreaseVol();
		//sp.decreaseVol();
		sp.increasevol();
		sp.increasevol();
		sp.decreaseVol();
		//sp.increasevol();
		//sp.increasevol();
		//sp.increasevol();
		//sp.increasevol();
		//sp.increasevol();
		//sp.increasevol();sp.increasevol();sp.increasevol();
		
		
	}

}

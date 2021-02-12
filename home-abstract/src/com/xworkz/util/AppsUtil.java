package com.xworkz.util;

import com.xworkz.xworkzapp.Browser;
import com.xworkz.xworkzapp.Chrome;

public class AppsUtil {
	public static void main(String[] args) {

		
		/*
		 * Apps app=new Chrome();//ancester to grand child app.entertainment();
		 * 
		 * app.information();
		 */
		  
		// app.entertainment();
		 
		
		  
		/*
		 * Apps apps=new Browser();// ancester to parent apps.entertainment();
		 * apps.information();
		 */
		 

		
		  Browser browser=new Chrome();//parent to child 
		  Chrome chrome=(Chrome) browser;
		  //chrome.entertainment(); 
		  chrome.information(); 
		  chrome.websites();
		 chrome.knowledge();
		 chrome.hello();
		  }

}

package com.xworkz.xworkzapp.speaker;

public class Speaker {
	
	private String color;
	private double price;
	private static String brandName="Noise";//
	private int batteryBackupForHours;
	
	public Speaker(double price,int batteryBackupForHours,String color)
	{
		//System.out.println("Speaker is connected");
		System.out.println("arg 1:"+this.price);
		System.out.println("arg 2:"+this.batteryBackupForHours);
		this.price=price;
		this.batteryBackupForHours=batteryBackupForHours;
		this.color=color;
		System.out.println("arg 1:"+this.price);
		System.out.println("arg 2:"+this.batteryBackupForHours);
		System.out.println("arg 3:"+this.color);
	}
// speaker properties
	private int maxVol=6;
	private int minVol=0;
	private boolean connected;
	private int currentVol;
	
	public void onOroff()
	{
		if (connected==false)// boolean default value is false, and its always off
		{
			this.connected=true;//we make it on by saying connected is true
			System.out.println("speaker is connected");
		}
		else if(connected==true)
		{
			this.connected=false;
			System.out.println("speaker is dis-connected");
		}
	}
public void decreaseVol()//decreasing the vol
{
	System.out.println("inside the decrease volume");
	if (connected==true)
	{ if(this.currentVol>this.minVol)
		{
		this.currentVol=this.currentVol-1;
		System.out.println("current vol is:"+currentVol);}
	else {
		System.out.println("gombe min volume is reached");
	}
	}
	else {
		System.out.println("dada min volume reached");
	}
}
	
public void increasevol()
{
	System.out.println("inside the increase volume");

	if(connected ==true)
		{
           if(this.currentVol<this.maxVol) {
        	  this.currentVol=this.currentVol+1;
        	  System.out.println("current vol is:"+currentVol);
           }
           else  {
        	   System.out.println("gube max volume reached");
           }}
           
           else  {
        	   System.out.println("dadda max volume reached");
           }
		}
		//getter and setter is used for private and it is a good practice
		public boolean isConnected() {
			return connected;
		}

		public void setConnected(boolean connected) {
			this.connected = connected;
		}
		public static String getBrandName() {
			return brandName;
		}
		public static void setBrandName(String brandName) {
			Speaker.brandName = brandName;
		}

}








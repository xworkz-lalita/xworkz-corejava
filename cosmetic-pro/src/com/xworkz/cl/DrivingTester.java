package com.xworkz.cl;

public class DrivingTester {

public static void main(String[] args) {
	
	Vehicle vehicle=new TruckImpl();
	
	
	Driving driving=new Driving("kanaka",vehicle);
    long start = System.nanoTime();
    driving.driving();
 
    long end = System.nanoTime();
    long execution = end - start;
    System.out.println("Execution time: " + execution + " nanoseconds");
  }

	
}


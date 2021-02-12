package com.xworkz.util;

import com.xworkz.xworkzapp.Geaser;
import com.xworkz.xworkzapp.Machines;
import com.xworkz.xworkzapp.VGuard;

public class MachineUtil {
	public static void main(String[] args) {
		Machines machine=new VGuard();
		//Machines geasr=new Geaser();
		machine.turnOnAndOff();
	}

}

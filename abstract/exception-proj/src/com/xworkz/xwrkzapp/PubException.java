package com.xworkz.xwrkzapp;

//custom checked exception
public class PubException extends  RuntimeException {

@Override
	public String getMessage() {
		return "Kids no entry";
	}
@Override
	public String toString() {
		
		return "Kids stay away";
	}
}


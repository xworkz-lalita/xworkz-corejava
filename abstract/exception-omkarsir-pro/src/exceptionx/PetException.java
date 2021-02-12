package exceptionx;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PetException extends Exception{
	private Map<String, String> map;
	
	public PetException() {
		System.out.println("created the petexception");
		this.map=new LinkedHashMap<String, String>();
	throw PetException;
	}
	public void createPet(String petName,String petOwner) {
		System.out.println("created pet method");
		System.out.println("args1"+petName);
		System.out.println("args2"+petOwner);
		
		}
	
	

}

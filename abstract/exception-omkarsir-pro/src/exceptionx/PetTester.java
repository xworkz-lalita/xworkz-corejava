package exceptionx;

import java.util.LinkedHashMap;
import java.util.Map;

public class PetTester {
public static void main(String[] args) {
	Map<String ,String> map=new LinkedHashMap<String, String>();
	map.put("zuzu", "Ramya");
	map.put("Gunda", "samya");
	map.put("Pintu", "kalyan");
	System.out.println(map.get("zuzu"));
}
}

package com.xworkz.celebration.tester;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

public class TesterPropertiesOptional {
	public static void main(String[] args) {
		String email = null;
		System.out.println(email);
		if (email != null) {
			System.out.println(email.toLowerCase());// we are going to get nullPointerException,...If we use the
													// condition then works fine.
		}

		Optional<String> optional = Optional.of("lalita.xworkz@gmail.com");// executes but if we give null then it will
																			// not works fine
		System.out.println(optional.isPresent());// ispresent return is true or false,
		if (optional.isPresent()) {
			System.out.println(optional);// Optional[lalita.xworkz@gmail.com] internally it calls tostring method
			System.out.println(optional.get());
		}
		// Optional<Integer> yearOptional=Optional.of(1998);//taking an integer
		Optional<Integer> yearOptional = Optional.empty();// used to check weather its present or not
		System.out.println(yearOptional.isPresent());
		yearOptional.ifPresent((v) -> System.out.println(v));// in optional we use the we use ifPresent rather than
																// Foreach

		// Optional<String> country=Optional.of("India");
		// Optional<String> country=Optional.ofNullable(null);// it takes both null as
		// well as the value
		// country.ifPresent(e->System.out.println(e));// if an argument present then it
		// prints the value
		// String value=country.map(String::toUpperCase).get();// if the value null then
		// we get nullpointerexceptional
		// System.out.println(value);
		// Optional<String> country=Optional.ofNullable("India");// here we don't get
		// any nullpointerexception and we get the answers
		Optional<String> country = Optional.ofNullable(null);
		country.ifPresent(e -> {
			String value = country.map(String::toUpperCase).get();
			System.out.println(value);
		});
		String def = country.orElse("india");
		System.out.println(def);
		/*
		 * Comparator<String> comparator = new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) {
		 * 
		 * return o2.compareTo(o1); } };
		 */

		Map<String, String> map = new TreeMap<String, String>((a, b) -> a.compareTo(b));// listed order where as the
																						// hashmap is as usual
		// sorted tree is used fpr sorted order //comparator to sort in ascending and
		// descending order
		map.put("Jai Ho", "Vijay Prakash");
		map.put("Kabira", "Arjit Singh");
		map.put("Kali Quater", "Vijay Prakash");
		map.put("Perfect", "Ed Sheeran");
		map.put("Happy Agide", "All Ok");
		Set<Entry<String, String>> entrySet = map.entrySet();
		entrySet.forEach(
				entry -> System.out.println("song is : " + entry.getKey() + " Singer is : " + entry.getValue()));
		// map.forEach((k, v) -> System.out.println(k + " " + v));
		Properties properties = new Properties();// it deal values from file, which always will be string
		properties.setProperty("Name", "Email");
		properties.setProperty("Email", "Name");
		System.out.println(properties.getProperty("Name"));// here we are going to get Email
		System.out.println(properties.getProperty("Email"));// here we are going to get the names

	}
}

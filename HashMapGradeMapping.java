package oop_concepts;

import java.util.HashMap;

public class HashMapGradeMapping {

	public static void main(String[] args) {
		HashMap<String, Integer> notlar = new HashMap<>();
		
		notlar.put("Ali", 80);
		notlar.put("veli",70);
		notlar.put("Taha", 100);
		
		System.out.println(notlar.get("Ali"));

	}

}

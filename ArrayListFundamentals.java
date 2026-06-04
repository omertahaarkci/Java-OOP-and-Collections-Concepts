package oop_concepts;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListFundamentals {

	public static void main(String[] args) {
		int[] dizi = new int [5]; //ornek dizi kullanımı
		ArrayList<Integer> liste = new ArrayList<Integer>();
		
		liste.add(2);
		liste.add(6);
		liste.add(10);
		System.out.println(liste.toString());
		liste.add(1,5);
		
		System.out.println(liste);
		System.out.println(liste.size());
		
		System.out.println(liste.get(3));
		
		for (int index = 0; index < liste.size(); index++) {
			System.out.println((index+1)+ ". eleman: "+ liste.get(index));
			
		}
		liste.set(0,100);
		System.out.println(liste);
		liste.add(30);
		System.out.println(liste);
		
		Collections.sort(liste);
		System.out.println(liste);
		Collections.reverse(liste);
		System.out.println(liste);
		
		liste.remove(0);
		System.out.println(liste.isEmpty());
		liste.clear();
		System.out.println(liste);
		System.out.println(liste.isEmpty());
		
		

		

	}

}

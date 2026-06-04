package oop_concepts;
import java.util.ArrayList;

public class ArrayListElementManipulation {

	public static void main(String[] args) {
		ArrayList<String> kelimeler = new ArrayList<String>();
		kelimeler.add("kalem");
		kelimeler.add("bilgisayar");
		kelimeler.add("masa");
		
		kelimeler.add("kitap");
		kelimeler.add("telefon");
		
		System.out.println(kelimeler);
		
		for(int index = 0; index<kelimeler.size(); index +=2) {
			kelimeler.add(index , "*");
			System.out.println(kelimeler);
		}
		System.out.println(kelimeler);
		
		for (int index = 0; index < kelimeler.size(); index++) {
			kelimeler.remove(index);
			
		}
		System.out.println(kelimeler);
	}
	
	

}

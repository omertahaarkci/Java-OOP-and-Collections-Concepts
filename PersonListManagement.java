package oop_concepts;
import java.util.ArrayList;

public class PersonListManagement {

	public static void main(String[] args) {
		Person k1  = new Person("Ahmet", 20);
		System.out.println(k1);
		
		ArrayList<Person> bireyler = new ArrayList<Person>();
		
		bireyler.add(k1);
		System.out.println(bireyler.size());
		System.out.println(bireyler.get(0).getIsim());//dizi[0].getIsım();
		System.out.println(bireyler.get(0).getYas());
		System.err.println(bireyler.get(0));
		Person k2 = new Person("Veli", 30);
		
		bireyler.add(k2);
		System.out.println(bireyler.size());
		bireyler.add(new Person ("Mehmet",25));
		kisiEkle(bireyler, "Ayşe",20);
		for (int index = 0; index<bireyler.size(); index++) {
			System.out.println("isim:" + bireyler.get(index).getIsim()+", yas:" + bireyler.get(index).getYas());
			
		}

	}
	public static void kisiEkle(ArrayList<Person> bireyler, String isim, int yas) {
		Person gecici = new Person(isim,yas);
		bireyler.add(gecici);
		//bireyler.add(new Kisi(isim,yas)); //--> KISA KULLANIIM
	}

}

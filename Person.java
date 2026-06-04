package oop_concepts;

public class Person {
	private String isim;
	private int yas;
	
	public Person() {
		
	}
	public Person(String isim, int yas) {
		this.isim=isim;
		this.yas=yas;
		
	}
	public String getIsim() {
		return this.isim;
		
	}
	public int getYas() {
		return this.yas;
		
	}
	public String toString() {
		return this.isim + "," + this.yas;
	}

}

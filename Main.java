package main;

public class Main {

	static int angka = 10; // bisa diakses di main
	int num = 10; // tidak bisa diakses di main
	
	public static void main(String[] args) {
	
		// bikin object kucing1 dari kelas Kucing
		Kucing kucing1 = new Kucing("Milo", 2); 
		
//		// akses atribut
		System.out.println("Nama: " + kucing1.nama);
		System.out.println("Umur: " + kucing1.umur);
		
//		// akses method
		kucing1.makan();
		kucing1.berjalan();

		// object kucing2 dari kelas Kucing
		Kucing kucing2 = new Kucing("Snowy", 1); // counter = 2
		System.out.println("Nama: " + kucing2.nama);
		System.out.println("Umur: " + kucing2.umur);
		kucing2.makan();
		kucing2.berjalan();
		
		// perbedaan variabel static dan non static
		// static -> terikat kelas, tidak harus bikin objek untuk bisa diakses
		// non static -> terikat objek, harus bikin objek untuk bisa diakses
		System.out.println("Counter static: " + Kucing.counterStatic);
		System.out.println("Counter non static" + kucing2.counterNonStatic);
		
		// method static kelas Kucing
		Kucing.mengeong();
		
		// method static kelas Main
		menu();
		
	}
	
	// static method
	public static void menu() {
		System.out.println("1. menu1");
		System.out.println("2. menu2");
	}

}

package main;

public class Kucing {
	// atribut
	String nama;
	int umur;
	
	// variabel static/non static
	static int counterStatic = 0;
	int counterNonStatic = 0;
	
	// klik kanan > source > generate constructor using field
	public Kucing(String nama1, int umur1) {
		nama = nama1;
		umur = umur1;
		counterStatic++;
		counterNonStatic++;
	}
	
	// method non static
	public void makan() {
		System.out.printf("Kucing %s sedang makan\n", nama);
	}
	
	public void berjalan() {
		System.out.printf("Kucing %s sedang berjalan\n", nama);
	}
	
	// method static
	public static void mengeong() {
		System.out.println("meong meong");
	}
}

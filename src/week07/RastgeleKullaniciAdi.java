package week07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RastgeleKullaniciAdi {


	 /*  Rastgele kullanýcý adý oluþturan JAVA kodu yazýnýz.
		 *  1. Adým : Kullanýcýdan ismini isteyelim
		 *  2. Adým : Kullanýcý adýndaki boþluklarý silelim.
		 *  3. Adým : Kullanýcý adýnýn alýnabilir olup olmadýðýna bakalým.
		 *  4. Adým : Eðer bizim listemizde öyle bir kullanýcý adý yoksa kullanýcý adý, kullanýcýnýn girdiði isim olsun.
		 *  5. Adým : Eðer bu kullanýcý adý zaten varsa, sonuna rastgele sayý oluþturup ekleyelim, ve gösterelim.
			List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
			veritabanindakiKullaniciListesi.add("Ahmet");
			veritabanindakiKullaniciListesi.add("Ayþe");
			veritabanindakiKullaniciListesi.add("Süleyman");
			veritabanindakiKullaniciListesi.add("Nazmi");
		 */

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String isim = scan.nextLine().trim();
		
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ayþe");
		veritabanindakiKullaniciListesi.add("Süleyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
		veritabanindakiKullaniciListesi.add("Gamze");
		veritabanindakiKullaniciListesi.add("Deniz");
		veritabanindakiKullaniciListesi.add("Mine");
		veritabanindakiKullaniciListesi.add("Gulay");
		
		String usernameNew ="";
		int random = new Random().nextInt(1000000);
		
		if(!veritabanindakiKullaniciListesi.contains(isim)) {
			usernameNew =isim;
			veritabanindakiKullaniciListesi.add(usernameNew);
			System.out.println("Kullanici adiniz: "+ usernameNew);
			
		}else {
			usernameNew = isim+""+random;
			veritabanindakiKullaniciListesi.add(usernameNew);
			System.out.println("Kullanici adiniz: "+ usernameNew);
		}
		

		scan.close();
	}

}

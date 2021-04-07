package week07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RastgeleKullaniciAdi {


	 /*  Rastgele kullan�c� ad� olu�turan JAVA kodu yaz�n�z.
		 *  1. Ad�m : Kullan�c�dan ismini isteyelim
		 *  2. Ad�m : Kullan�c� ad�ndaki bo�luklar� silelim.
		 *  3. Ad�m : Kullan�c� ad�n�n al�nabilir olup olmad���na bakal�m.
		 *  4. Ad�m : E�er bizim listemizde �yle bir kullan�c� ad� yoksa kullan�c� ad�, kullan�c�n�n girdi�i isim olsun.
		 *  5. Ad�m : E�er bu kullan�c� ad� zaten varsa, sonuna rastgele say� olu�turup ekleyelim, ve g�sterelim.
			List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
			veritabanindakiKullaniciListesi.add("Ahmet");
			veritabanindakiKullaniciListesi.add("Ay�e");
			veritabanindakiKullaniciListesi.add("S�leyman");
			veritabanindakiKullaniciListesi.add("Nazmi");
		 */

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String isim = scan.nextLine().trim();
		
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ay�e");
		veritabanindakiKullaniciListesi.add("S�leyman");
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

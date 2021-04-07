package week04;

import java.util.Scanner;

public class Ternary {

	
	/*
	Ternary kullanarak:
			int variable : FIYAT
			string variable : Secim (String Secim=.....)
			price = $10 ise Print “UCUZ”
			price 10-$20 arasi ise Print “UYGUN”
			diger durumlar icin “PAHALI” yazdirin.
		*/

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Almak istediginiz urunun fiyatini giriniz");
		int price = scan.nextInt();
		
	
		String secim = price <=0 ? "Lutfen gecerli bir fiyat degeri giriniz" : price<10 ? "UCUZ" :  price>10 && price<20 ? "UYGUN" : "PAHALI";
		System.out.println(secim );
		
		scan.close();
	}

}

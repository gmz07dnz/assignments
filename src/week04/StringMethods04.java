package week04;

import java.util.Scanner;

public class StringMethods04 {
	
	/*
	
		Çift uzunlukta bir degiskenin ilk yarýsýný konsolda yazdirmak için bir Java programý yazýniz.
    	 ORNEK:
	     INPUT      :  Python
		OUTPUT :   Pyt
    */


	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Ilk yarisini yazdirmak icin bir degisken giriniz");
		String word = scan.nextLine();
		
		if(word.length()%2 == 0) {
			System.out.println(word.substring(0, word.length()/2));
		}else {
		   System.out.println("Girmis oldugunuz degisken cift uzunlukta degildir.");
		}
		
		scan.close();

	}

}

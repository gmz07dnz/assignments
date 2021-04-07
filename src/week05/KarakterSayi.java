package week05;

import java.util.Scanner;

public class KarakterSayi {

          	/*
              	Kullanýcýdan bir isim ve karakter girmesini isteyin, sonra karakterin kaç kez tekrarlandýðýný kontrol edin.
          	e.g:
	       char ch1= 'a' ;
	      String name =“John came late" 
            => Tekrar Sayisi = 2
         	*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir isim girin");
		String isim = scan.nextLine();
		System.out.println("Tekrar sayisini bulmak istediginiz karakteri giriniz");
		char ch = scan.next().charAt(0);
		
		// 1. yol
		int count =0;
	    for (int i = 0; i< isim.length(); i++) {
	    	if (isim.charAt(i)== ch) {
	    		count++;
	    	}
	    }
	    
	    System.out.println(ch + " karakteri " + count + " kere kullanilmistir. " );
	    
	   scan.close();
	}

}

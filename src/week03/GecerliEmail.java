package week03;

import java.util.Scanner;

public class GecerliEmail {

	/*
    Kullanicidan email girmesini isteyin
   @ isareti icermiyorsa “gecerli bir email girin” yazdirin
   @ isaretinden sonra sadece “gmail.com” yaziyorsa “email onaylandi” yazdirin
   @ isaretinden sonra “gmail.com” disinda birsey yaziyorsa “Lutfen gmail hesabinizi girin” yazdirin
   ORNEK:
   INPUT : techproed.com OUTPUT : “gecerli bir email girin”
   INPUT : techproed@gmail.com OUTPUT : “email onaylandi”
   INPUT : techproed@hotmail.com OUTPUT : “Lutfen gmail hesabinizi girin”
   */


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen emailinizi giriniz");
		String email = scan.next();
		
		int index = email.indexOf('@');
		
		if (!email.contains("@")) {
			System.out.println("gecerli bir email girin");
		}else if (email.substring(index+1).equals("gmail.com")) {
			System.out.println("email onaylandi");
		}else if (!email.substring(index+1).replace("gmail.com", "").isEmpty()) {    //    else if (!email.substring(index+1).equals("gmail.com")) 
			System.out.println("Lutfen gmail hesabinizi girin");                                  

		}
		
		
	scan.close();
		
 
	}
}

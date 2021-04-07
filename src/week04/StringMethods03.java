package week04;

import java.util.Scanner;

public class StringMethods03 {

	/*
	 * Kullan�c�dan firstName ve lastName'i girmesini isteyin, ard�ndan ba�
	 * harflerini b�y�k harf yap�n ve geri kalan� tamamen kucuk harf olarak konsolda yazdirin. 
	 * ferhat => Ferhat kirac => Kirac
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Isminizi giriniz");
		String firstName = scan.nextLine();
		System.out.println("Soyisminizi giriniz");
		String lastName = scan.nextLine();
		
		firstName = firstName.substring(0,1).toUpperCase().concat(firstName.substring(1).toLowerCase());
		lastName = lastName.substring(0,1).toUpperCase().concat(lastName.substring(1).toLowerCase());
		
		System.out.println(firstName +" " +lastName );

		scan.close();
	}

}

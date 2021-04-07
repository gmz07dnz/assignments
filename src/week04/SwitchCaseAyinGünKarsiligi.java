package week04;

import java.util.Scanner;

public class SwitchCaseAyinG�nKarsiligi {

	  
     	/*  
	       Kullanicinin girmis oldugu ay icin kac gun oldugunu yazdiran Switch Case java kodunu yaziniz.
	 	*/

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("G�n sayisini gormek istediginiz ayin ismini giriniz");
		String month = scan.next().toUpperCase();
		
		switch(month){
		case "OCAK" :
			System.out.println(month + " ayi 31 g�nd�r.");
			break;
		case "SUBAT" :
			System.out.println(month + " ayi 28 g�nd�r.");
			break;
		case "MART" :
			System.out.println(month + " ayi 31 g�nd�r.");
			break;
		case "NISAN" :
			System.out.println(month + " ayi 30 g�nd�r.");
			break;
		case "MAYIS" :
			System.out.println(month + " ayi 31 g�nd�r.");
			break;
		case "HAZIRAN" :
			System.out.println(month + " ayi 30 g�nd�r.");
			break;
		case "TEMMUZ" :
			System.out.println(month + " ayi 31 g�nd�r.");
			break;
		case "AGUSTOS" :
			System.out.println(month + " ayi 31 g�nd�r.");
			break;
		case "EYLUL" :
			System.out.println(month + " ayi 30 g�nd�r.");
			break;
		case "EKIM" :
			System.out.println(month + " ayi 31 g�nd�r.");
			break;
		case "KASIM" :
			System.out.println(month + " ayi 30 g�nd�r.");
			break;
		case "ARALIK" :
			System.out.println(month + " ayi 31 g�nd�r.");
			break;
		default:
			System.out.println("Lutfen gecerli bir ay ismi giriniz");
		
		}
		
		scan.close();
		
	}

}

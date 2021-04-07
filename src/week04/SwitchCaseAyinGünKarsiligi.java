package week04;

import java.util.Scanner;

public class SwitchCaseAyinGünKarsiligi {

	  
     	/*  
	       Kullanicinin girmis oldugu ay icin kac gun oldugunu yazdiran Switch Case java kodunu yaziniz.
	 	*/

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Gün sayisini gormek istediginiz ayin ismini giriniz");
		String month = scan.next().toUpperCase();
		
		switch(month){
		case "OCAK" :
			System.out.println(month + " ayi 31 gündür.");
			break;
		case "SUBAT" :
			System.out.println(month + " ayi 28 gündür.");
			break;
		case "MART" :
			System.out.println(month + " ayi 31 gündür.");
			break;
		case "NISAN" :
			System.out.println(month + " ayi 30 gündür.");
			break;
		case "MAYIS" :
			System.out.println(month + " ayi 31 gündür.");
			break;
		case "HAZIRAN" :
			System.out.println(month + " ayi 30 gündür.");
			break;
		case "TEMMUZ" :
			System.out.println(month + " ayi 31 gündür.");
			break;
		case "AGUSTOS" :
			System.out.println(month + " ayi 31 gündür.");
			break;
		case "EYLUL" :
			System.out.println(month + " ayi 30 gündür.");
			break;
		case "EKIM" :
			System.out.println(month + " ayi 31 gündür.");
			break;
		case "KASIM" :
			System.out.println(month + " ayi 30 gündür.");
			break;
		case "ARALIK" :
			System.out.println(month + " ayi 31 gündür.");
			break;
		default:
			System.out.println("Lutfen gecerli bir ay ismi giriniz");
		
		}
		
		scan.close();
		
	}

}

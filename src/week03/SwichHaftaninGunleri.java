package week03;

import java.util.Scanner;

public class SwichHaftaninGunleri {

	
	     /* 
	             Kullan�c�n� 1 ile 7 aras�nda bir say� girdi�inde haftan�n hangi g�n� oldu�unu yazd�ran switch case java kodunu yazin�z.
			 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" Haftanin hangi gunu oldugunu yazd�rmak icin 1 ile 7 aras�nda bir sayi giriniz");
        int num = scan.nextInt();
        
        switch (num) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sali");
			break;
		case 3:
			System.out.println("Carsamba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazari");
			break;
		default:
			System.out.println("Lutfen dogru bir deger giriniz");
			break;
		} 
        
        scan.close();
	}

}

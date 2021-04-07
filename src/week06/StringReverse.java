package week06;

import java.util.Scanner;

public class StringReverse {

	// Stringi ters çevirmek için bir Java Programý yazýn
	//1.Yol: StringBuilder () kullanarak
	//2.Yol: String Classini kullanarak
	//3.Yol: Bir method oluþturun, ardýndan methodu main method dan çaðýrýn

	public static void main(String[] args) {
		
		//1.Yol: StringBuilder () kullanarak
		Scanner scan = new Scanner(System.in);
		System.out.println("Tersini yazdirmak icin bir String giriniz");

		String str1 = scan.nextLine();
		
//		StringBuilder str = new StringBuilder(scan.nextLine());
//		str.reverse();
//		System.out.println(str);
		

		//2.Yol: String Classini kullanarak
		
		/*
		
		
		String strRev ="";
		
		for (int i = str1.length()-1; i >=0 ; i--) {
			strRev += str1.charAt(i);
		}
		System.out.println(strRev);
		
		*/
		
		strRev(str1);
		
		scan.close();
		
	}

	
	 public static String strRev(String str) {
		 
		 String strRev ="";
			
			for (int i = str.length()-1; i >=0 ; i--) {
				strRev += str.charAt(i);
			}
			System.out.println(strRev);
		 
		 return strRev;
		 
	 }
}


package week03;

import java.util.Scanner;

public class UcgenHesap {

	/*
	 * Kullanicidan 3 tane pozitif tam sayi alalim bu uc sayidan ucgen olup olmama
	 * durumunu kontrol edelim eger ucgen olabiliyor ise, es kenar ucgen mi kontrol  edelim.
	 
	 * Ucgen olma kosullari. b+c>a>b-c 1 a+c>b>a-c 1 a+b>c>a-b 1
	 
	 * Eskenar ucgen olma kosullari. a=b=c
	 
	 * Konsolda asagidaki durumlari yazdiralim.
	 *  Eskenar ucgen 
	 *  Sadece ucgen 
	 *  Ucgen  degildir
	 */
	 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ucgen olma durumunu ve eskenar ucgen olma durumunu kontrol etmek icin uc tam sayi giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if ( (b+c>a && a>b-c) &&(a+c>b && b>a-c ) && ( a+b>c && c>a-b)) {
			if(a == b  && a == c) {
				System.out.println("eskenar ucgen");
			}else {
				System.out.println("Ucgen");
			}
		}else {
			System.out.println("ucgen degildir");
		}
		
		scan.close();

	}

}

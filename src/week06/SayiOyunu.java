package week06;

import java.util.Scanner;

public class SayiOyunu {

	/* Kullanicidan sayilar girmesini isteyin
     * ve girdigi sayilari toplayip yazdirin.
     * yeni sayi isteyin
     * girilen sayilarin toplami 100 'u gecerse
     * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
     *
     */

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int sum =0;
		int count =0;
		do {
			System.out.println("Toplamý 100'u gecene kadar sayi giriniz");
			int sayi = scan.nextInt();
	        count ++;
	        sum += sayi;
			
		} while (sum<101);
		
		System.out.println(count + " kere sayi girdin. Bu kadar sayi yeter.");
		
		
		scan.close();
	}

}

package week04;

import java.util.Scanner;

public class StringMethods02 {

	/*
	Kullanýcýdan bir kelime girmesini isteyin. Sözcükte tek sayýda karakter ve 3 veya daha fazla karakter içeriyorsa, kelimenin ortasýndaki karakteri yazdýrýn.
	*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String word = scan.next();
		
		if(word.length()%2 ==1 && word.length()>=3) {
			char middleOfWord = word.charAt(word.length()/2);
			System.out.println(middleOfWord);
		}else {
			System.out.println("orta karakter yoktur");
		}
	
		
		scan.close();
	}

}

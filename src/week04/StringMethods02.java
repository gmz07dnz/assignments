package week04;

import java.util.Scanner;

public class StringMethods02 {

	/*
	Kullan�c�dan bir kelime girmesini isteyin. S�zc�kte tek say�da karakter ve 3 veya daha fazla karakter i�eriyorsa, kelimenin ortas�ndaki karakteri yazd�r�n.
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

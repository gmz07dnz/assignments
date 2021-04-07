package week03;

import java.util.Scanner;

public class SwitchCase01 {

	
	/*
    Print "L�tfen i� unvan�n�z� girin� 
    �jobTitle� isimli bir degisken olusturun ve kullanicidan isteyin.
    Do�ru jobTitle yazd�rmak i�in a�a��daki test datalarini kullan�n. Example :
    Eger jobTitle  qa ise print ��� unvan�n�z Quality Analyst� 
    test data: qa ise print Quality Analyst 
    dev ise print Developer 
    ba ise print Business Analyst 
    pm ise print Project Manager
   */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen is unvan�n�z� girin\n qa\n dev\n ba\n pm");
		String jobTitle = scan.nextLine().toLowerCase();
		
		switch(jobTitle) {
		case "qa" :
			System.out.println("�� unvan�n�z Quality Analyst");
		break;
		case "dev" :
			System.out.println("�� unvan�n�z Developer");
		break;
		case "ba" :
			System.out.println("�� unvan�n�z Business Analyst");
		break;
		case "pm" :
			System.out.println("�� unvan�n�z Project Manager");
		break;
		default:
			System.out.println("Dogru bir tercih yapiniz");
		break;
		
		}
		
		scan.close();

	}

}

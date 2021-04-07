package week03;

import java.util.Scanner;

public class SwitchCase01 {

	
	/*
    Print "Lütfen iþ unvanýnýzý girin” 
    “jobTitle” isimli bir degisken olusturun ve kullanicidan isteyin.
    Doðru jobTitle yazdýrmak için aþaðýdaki test datalarini kullanýn. Example :
    Eger jobTitle  qa ise print “Ýþ unvanýnýz Quality Analyst” 
    test data: qa ise print Quality Analyst 
    dev ise print Developer 
    ba ise print Business Analyst 
    pm ise print Project Manager
   */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen is unvanýnýzý girin\n qa\n dev\n ba\n pm");
		String jobTitle = scan.nextLine().toLowerCase();
		
		switch(jobTitle) {
		case "qa" :
			System.out.println("Ýþ unvanýnýz Quality Analyst");
		break;
		case "dev" :
			System.out.println("Ýþ unvanýnýz Developer");
		break;
		case "ba" :
			System.out.println("Ýþ unvanýnýz Business Analyst");
		break;
		case "pm" :
			System.out.println("Ýþ unvanýnýz Project Manager");
		break;
		default:
			System.out.println("Dogru bir tercih yapiniz");
		break;
		
		}
		
		scan.close();

	}

}

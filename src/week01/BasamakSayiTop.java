package week01;

import java.util.Scanner;

public class BasamakSayiTop {

	/*
	Kullanicidan 3 basamakli bir sayi isteyin ve bu sayinin basamaklari toplamini konsolda yazdiran programi yaziniz.
	*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a three digits number");
		int num = scan.nextInt();
		int originalNumber = num;
		 if(num<1000 && num>99) {
			 int firstDigit = num/100;
			 int lastDigit = num %10;
			 num/=10;
			 int secondDigit = num%10;	
			 int sum = lastDigit+secondDigit+firstDigit;
			 System.out.println("the sum of digits of "+originalNumber + " is: "+sum  );
		 } else {
			 System.out.println("Please enter three digits number");
		 }

		scan.close();
	

	}

}

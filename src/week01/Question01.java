package week01;

import java.util.Scanner;

public class Question01 

            /*
                   Kullaniciya gunde kac cay ictigini ve cayi kac sekerli ictigini sorun. Daha sonra kullanicinin yilda kac kg seker kullandigini hesaplayan java kodunu yaziniz.
                    1 seker= 1.7 gr
                    Ornek: Input ⇒      
                    Cay : 10
                     Seker :2
                   Output : 12.41 kg/yil
              */
{

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("how many glass of  tea do you drink a day?");
		int tea = scan.nextInt();
		System.out.println("how many sugars  do you use for a glass a day?");
		int sugar = scan.nextInt();
		
		double sugarYearKg = tea*sugar*1.7/1000*365;
		
		System.out.println(sugarYearKg + " kg of sugar is used in a year");
		
		scan.close();

	}

}

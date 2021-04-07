package week03;

import java.util.Scanner;

public class NestedIf {

	/*
	“NestedIfStatements” class olusturun.
	
           Kullanicidan 2 kisi icin dogum gunu girmesini isteyin.
	
           Yýlý, ayi ve günü tamsayý olarak alýn e NestedIf kullanarak kimin yas olarak daha buyuk oldugunu ekrana yazdirin. 
           Examples:
	       int birthYearOfYusuf=2000, birthMonthOfYusuf=12, birthDayOfYusuf=12,
        	int birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21;
	       Yusuf is Older            
*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Karsilastrma yapmak icin 1. kisinin dogum tarih yilini giriniz");
		int birthYearOfYusuf=scan.nextInt();
		System.out.println("Karsilastrma yapmak icin 1. kisinin dogum tarih ayini giriniz");
		int birthMonthOfYusuf=scan.nextInt();
		System.out.println("Karsilastrma yapmak icin 1. kisinin dogum tarih gununu giriniz");
	    int  birthDayOfYusuf=scan.nextInt();

		System.out.println("Karsilastrma yapmak icin 2. kisinin dogum tarih yilini giriniz");
		int birthYearOfMehmet= scan.nextInt();
		System.out.println("Karsilastrma yapmak icin 2. kisinin dogum tarih ayini giriniz");
		int birthMonthOfMehmet=scan.nextInt();
		System.out.println("Karsilastrma yapmak icin 2. kisinin dogum tarih gununu giriniz");
		int  birthDayOfMehmet=scan.nextInt();
		
		
		if (birthYearOfYusuf>birthYearOfMehmet) {
			System.out.println("Yusuf is older");
		}else if (birthYearOfYusuf<birthYearOfMehmet){
			System.out.println("Mehmet is older");
		}else if (birthYearOfYusuf==birthYearOfMehmet  ) {
			if(birthMonthOfYusuf>birthMonthOfMehmet) {
				System.out.println("Yusuf is older");
			}else if(birthMonthOfYusuf<birthMonthOfMehmet) {
				System.out.println("Mehmet is older");
			}else if ((birthMonthOfYusuf==birthMonthOfMehmet)){
				if(birthDayOfYusuf>birthDayOfMehmet) {
					System.out.println("Yusuf is older");
					}else if (birthDayOfYusuf<birthDayOfMehmet) {
						System.out.println("Mehmet is older");
			}else {
				System.out.println("Yaslari ayni");
			}
		}
		

	}
		
		scan.close();
	}

}

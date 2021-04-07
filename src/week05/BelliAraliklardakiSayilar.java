package week05;

public class BelliAraliklardakiSayilar {

	/*
	1-20 arasindaki -20 dahil olmak üzere-  çift sayýlarý yazdýrýn. e.g.2 4 6 .. 20


	1-20 arasindaki -20 dahil olmak üzere-  tek sayýlarý yazdýrýn. e.g 1,3,5,7,...,19 Virgul dahil!


	20 ile 1 arasindaki 5 e bolunebilen sayillari 20 den geriye gelerek yazdirin. e.g.20,15,10,5
	 
	1 - 20 arasýndaki tüm çift sayýlarýn toplamýný bulun.

	11 veya 15 hariç 1-20 arasýndaki tüm sayýlarý yazdýrýn; break or continue kullanin. 
	*/

	public static void main(String[] args) {
	
		// 1-20 arasindaki -20 dahil olmak üzere-  çift sayýlarý yazdýrýn. e.g.2 4 6 .. 20
		
		for (int i =1; i<21; i++) {
			if(i%2 ==0 ) {
				System.out.print(i+ " ");
			}
		}
		System.out.println();
		
		// 1-20 arasindaki -20 dahil olmak üzere-  tek sayýlarý yazdýrýn. e.g 1,3,5,7,...,19 Virgul dahil!


		for (int i =1; i<21; i++) {
			if(i%2 ==1 ) {
				System.out.print(i+ ", ");
			}
		}
		System.out.println();
		
		
		// 20 ile 1 arasindaki 5 e bolunebilen sayillari 20 den geriye gelerek yazdirin. e.g.20,15,10,5

		for (int i = 20; i>0 ; i--) {
			if(i%5 ==0 ) {
				System.out.print(i+ ", ");
			}
		}
		System.out.println();
		
		
		// 1 - 20 arasýndaki tüm çift sayýlarýn toplamýný bulun.
		int sum =0;
		for (int i =1; i<21; i++) {
			if(i%2 ==0 ) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		// 11 veya 15 hariç 1-20 arasýndaki tüm sayýlarý yazdýrýn; break or continue kullanin. 
	
		for (int i =1; i<21; i++) {
			if(i == 11 || i==15) {
				continue;
			}
			
			System.out.print(i+ ", ");
		}
		
		
		
	}

}

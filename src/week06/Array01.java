package week06;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array01 {

	 /*
     * SORU 3) Kullanicidan 100 den kucuk bir tamsayi isteyip, bu sayinin daha
     * onceden tanimlanmis array’de olup olmadigini kullaniciya donen bir method
     * yaziniz
     *
     * Array={3,5,21,32,34,45,56,57,76,87,95}
     *
     * Input : 5  Output: Girdiginiz sayi Arrayde var
     * Input : 15 Output: Girdiginiz sayi Arrayde yok
     */

	public static void main(String[] args) {
		
		Integer array[]={3,5,21,32,34,45,56,57,76,87,95};
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Array'de olup olmadýgýný kontrol etmek icin bir tam sayi giriniz");
		int sayi = scan.nextInt();
		
		elemanVarmiArr(array,sayi);
		elemanVarmiArr1(array,sayi);
		
		scan.close();

	}

	public static void elemanVarmiArr1(Integer[] array, int sayi) {
		
		int count =0;
		for (int w: array) {
			if (sayi==w) {
				System.out.println("Girdiginiz sayi Arrayde var");
				break;
			}else {
				count++;
			}
		}
		
		if (count == array.length) {
			System.out.println("Girdiginiz sayi Arrayde yok");
		}
		
	}

	
	public static void elemanVarmiArr(Integer[] array, int sayi) {
		List<Integer> list =Arrays.asList(array);
		
		if(list.contains(sayi)) {
			System.out.println("Girdiginiz sayi Arrayde var");
		}else {
			System.out.println("Girdiginiz sayi Arrayde yok");
		}
		
	}

}

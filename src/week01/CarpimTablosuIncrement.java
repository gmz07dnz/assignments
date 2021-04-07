package week01;

public class CarpimTablosuIncrement {

	/*
	Iki degisken atayin : 
		num1=1,
		num2=1 
		‘increment’ yontemini kullanarak Carpim Tablosunu yazdirin.
		Note: ++ increment isareti 1 arttirir. 
		Asagidaki sekilde Carpim Tablosunu yazdirin:
		1 X 1 = 1
		1 X 2 = 2  
		1 X 3 = 3
		...
		1 X 10 =10
		*/

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 1;
		
		for (int i = 0; i< 10 ; i++) {
			System.out.println(num1 + " x " + num2 + "= " + (num1* num2++));
		}

	}

}

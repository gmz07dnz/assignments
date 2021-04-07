package week07;

public class Swap {

	/*
	Swap islemini iki yoldan yaptiginiz java kodunu yaziniz.
	1.Yol: 3. degisken kullanarak 
	2.Yol: 3. degisken kullanmadan
	*/

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		// 1.Yol: 3. degisken kullanarak 
		System.out.println("Before swap: a= " + a);
		System.out.println("Before swap: b= " + b);
		int c = 0;
		
		 c = a;  
		 a =b;
		 b = c;
		
			System.out.println("After swap: a= " + a);
			System.out.println("After swap: b= " + b);
		
		
			// 2.Yol: 3. degisken kullanmadan
		
			int num1 = 1;
			int num2 = 2;
			
			System.out.println("Before swap: num1= " + num1);
			System.out.println("Before swap: num2= " + num2);
			
			num1 = num1 + num2;
			num2 = num1 - num2;  // num1
			num1 = num1 - num2;
			
			System.out.println("After swap: num1= " + num1);
			System.out.println("After swap: num2= " + num2);
			
			
			

	}

}

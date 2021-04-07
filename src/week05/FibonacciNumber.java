package week05;

import java.util.Scanner;

public class FibonacciNumber {

	 
	/*
	Get numbers from the user and output that number consecutive fibonacci number sequence
	     	e.g : User enters 10
	output : 0 1 1  2  3  5 8 13 21 34
	      	*/

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		int num1 =0;
		int num2=1;
		int temp= 0;
		
		int i =0;
		do {
	    
		System.out.print(temp + " ");
		 num1=num2;
		 num2=temp;
		 temp = num1 + num2;
			
		i++;	
		}while(i<num);
		
		scan.close();
	}
}

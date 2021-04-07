package week05;

import java.util.ArrayList;
import java.util.List;

public class TekrarliKarakterler {

	/*
	Verilen String array icerisindeki tekrar eden karakterleri yazdiran Java kodunu yaziniz. 
	String str=“ilovejavatoo” 
	Output: o v a
	         */

	public static void main(String[] args) {
		
		String str="ilovejavatoo";
		String strArr[] = str.split("");
	
		List<String> chList = new ArrayList<>();
     	List<Integer>  countList = new ArrayList<>();

		int count = 0;
		for (int i =0; i<strArr.length-1; i++) {
			for (int j = i+1; j<strArr.length; j++ ) {
				if (strArr[i].equals(strArr[j])){
					count++;
			}
     	}
			if(!chList.contains(strArr[i])) {	  // tek eleman eklesin diye
			if(count!=0) {                              // tekrarlý olaný eklesin -- iç içe if ile hem farklý olan karakteri hem de tekrarlý olaný eklemis olacak 
				chList.add(strArr[i]);	
			countList.add(count+1);
			}
			count=0;
		}
		}
	
	System.out.println(chList);
	System.out.println(countList);
		
	for (int i =0; i<chList.size(); i++) {
			
				System.out.print(chList.get(i) +" karakteri " +  countList.get(i) + " defa\n");
			}
	//	System.out.println(chList.get(chList.size()-1) +" karakteri " +  countList.get(chList.size()-1) +" kere kullanilmis");
		
		
		// 2.yol
		
		int countKarakter[] = new int [strArr.length];
		
		for (int i =0; i<strArr.length; i++) {
			if(str.contains(strArr[i])) {
				countKarakter[str.indexOf(strArr[i])]++;
				}
			}
		
		for (int i =0; i<countKarakter.length; i++) {
			if (countKarakter[i]>1) {
				System.out.println(strArr[i] + " "+ countKarakter[i] + " defa" );
			}
		}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}



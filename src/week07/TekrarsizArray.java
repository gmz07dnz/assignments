package week07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TekrarsizArray {

        /*
         * Verilen array’deki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

	
	public static void main(String[] args) {
		
		Integer arr[] = {1,2,2,3,1,4,2,5,6,8,7,5,9,1};
	
	
	// 1. yol  
	List<Integer> listArray =Arrays.asList(arr);
    List<Integer> listTekrarsiz = new ArrayList<>();
	
   for(int w: listArray) {
	   
	   if(!listTekrarsiz.contains(w)) {
		   listTekrarsiz.add(w);
	   }
   }
    
   Object[] arrTekrarsiz = listTekrarsiz.toArray();
   System.out.println(Arrays.toString(arrTekrarsiz));	
		
   // 2. yol  
   List<Integer> listTekrarsiz1 = new ArrayList<>();
   for(int i =0; i< arr.length-1; i++) {
	   for(int j =i+1; j<arr.length; j++) {
	   if(arr[i] != arr[j]) {
		   if(!listTekrarsiz1.contains(arr[i]) ) {
				  listTekrarsiz1.add(arr[i]);
			  }
		   }
	   else {
		  if(!listTekrarsiz1.contains(arr[i]) ) {
			  listTekrarsiz1.add(arr[i]);
		  }
	   }
	   }
	
   }
   Object[] arrTekrarsiz1 = listTekrarsiz1.toArray();
   System.out.println(Arrays.toString(arrTekrarsiz1));	
   
   
	}

}

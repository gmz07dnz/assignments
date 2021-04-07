package week05;

public class CharAt {

	/*
	String name = "Emine";
    charAt yöntemini kullanarak konsolda tüm harfleri yazdýrýn.
    */

	public static void main(String[] args) {
		
		String name = "Emine";
		
		for (int i =0; i< name.length(); i++ ) {
			System.out.print(name.charAt(i) + " ");
		}
		

	}

}

package week05;

public class CharAt {

	/*
	String name = "Emine";
    charAt y�ntemini kullanarak konsolda t�m harfleri yazd�r�n.
    */

	public static void main(String[] args) {
		
		String name = "Emine";
		
		for (int i =0; i< name.length(); i++ ) {
			System.out.print(name.charAt(i) + " ");
		}
		

	}

}

package week01;

public class String01 {

	/*
	Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz. 
	String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	*/    

	public static void main(String[] args) {
		
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String output = pickName.substring(0,1).concat(pickName.substring(11, 12));
		System.out.println(output);
		
		
	}

}

package learnJava;

import java.util.Base64;

public class EncryptDecryptData {

	public static void main(String[] args) {
		
		for( int i=0; i<=5; i++) {
			
			String encrptData= "wSXrfv@Ujm806$$";
			String  decrptData = "d1NYcmZ2QFVqbTgwNiQk" ;
			
			byte[] encodedBytes = Base64.getEncoder().encode(encrptData.getBytes());
			System.out.println("encodedBytes --------------->" + new String(encodedBytes));
			
			
			byte[] decodeBytes = Base64.getDecoder().decode(decrptData.getBytes());
			System.out.println("decodedBytes --------------->" + new String(decodeBytes));
			
		}
		

	}

}

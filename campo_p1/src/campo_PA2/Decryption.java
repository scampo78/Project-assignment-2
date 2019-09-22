package campo_PA2;

public class Decryption {

	public static void main(String[] args) {
		
		int digit1 = 1;
		int digit2 = 2;
		int digit3 = 9;
		int digit4 = 0;
		int temp1;
		int temp2;
		
		System.out.println("Encrypted code: " + digit1 + digit2 + digit3 + digit4);
		
		temp1 = digit3;
		digit3 = digit1;
		digit1 = temp1;
		
		temp2 = digit4;
		digit4 = digit2;
		digit2 = temp2;
		
		System.out.println("Encrypted code: " + digit1 + digit2 + digit3 + digit4);
		
		digit1 = (digit1 - 7 + 10) %10;
		digit2 = (digit2 - 7 + 10) %10;
		digit3 = (digit3 - 7 + 10) %10;
		digit4 = (digit4 - 7 + 10) %10;
		
		System.out.println("Encrypted code: " + digit1 + digit2 + digit3 + digit4);
	}

}

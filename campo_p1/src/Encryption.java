
public class Encryption {

	public static void main(String[] args) {

		int digit1 = 2;
		int digit2 = 3;
		int digit3 = 4;
		int digit4 = 5;
		int temp1;
		int temp2;
		
		System.out.println("4 digit code: " + digit1 + digit2+ digit3 + digit4);
		
		digit1 = (digit1 + 7)%10;
		digit2 = (digit2 + 7)%10;
		digit3 = (digit3 + 7)%10;
		digit4 = (digit4 + 7)%10;
		
		System.out.println("4 digit code: " + digit1 + digit2+ digit3 + digit4);
		
		temp1 = digit1;
		digit1 = digit3;
		digit3 = temp1;
		
		temp2 = digit2;
		digit2 = digit4;
		digit4 = temp2;
		
		System.out.println("Encrypted 4 digit code: " + digit1 + digit2+ digit3 + digit4);
		
		
		

	}

}

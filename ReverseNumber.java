
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 151;
		int reversed = 0;
		
		
		

		while (num != 0) {
		int digit = num % 10; // Extract last digit
		
		System.out.println("the digit"+digit+"\n");
		reversed = reversed * 10 + digit;// Append digit to reversed
		
		System.out.print("The Reverse"+reversed+"\n");
		
		
		num /= 10; // Remove last digit
		System.out.println("The number"+num+"\n");
		
		}

		System.out.println("Reversed Number: " + reversed);
		}
	}



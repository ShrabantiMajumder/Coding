
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str = "Automation";

	        String reversed = "";
	        
	        

	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed += str.charAt(i);
	        }

	        System.out.println("Reversed String: " + reversed);
	    }
	}

/*
Trick - Just print from last.
take length()-1 as last index of original string.
then decrease by 1
go till first index
*/
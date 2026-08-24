
public class GcdV1 {

	
	public static void main(String[] args) {
		
		
		
		
		int n1 = 60;
		int n2 = 24;
		
		int On1=n1;
		int On2=n2;
		int temp;
		int rem=0;
		
		if (n1>n2) {
			temp=n1;
			n1=n2;
			n2=temp;
		}
		
		while (n1!=0) {
			
			rem=n2%n1;
			n2=n1;
			n1=rem;
			
			
	}
		System.out.println(n2);
	}
}

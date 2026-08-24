
public class ReverseStringv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String rev="";
		String s="NO26 Sound";
		
		for (int i=0;i<s.length();i++) {
		
			char c = s.charAt(i);
			rev= rev+c;
		}
		
		System.out.print(rev);
		
	}

}

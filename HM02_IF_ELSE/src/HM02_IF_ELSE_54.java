import java.util.Scanner;
public class HM02_IF_ELSE_54 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		char A1=a.charAt(1);
		char A2=a.charAt(4);
		int A1T=0;
		int a1_n = a.charAt(1) - 48;
		int a2_n = a.charAt(4) - 48;
		char aa = a.charAt(0);
		String o = Character.toString(aa) ;
		
		if (a.length()>5) {
			if(a.charAt(0)==a.charAt(2)) {
				char a1=a.charAt(2);
				char a2=a.charAt(5);
				if(a1=='+' && a2=='+') {
					a1_n = a1_n + Character.getNumericValue(A1);
					a2_n = a2_n + Character.getNumericValue(A2);
					A1T=a1_n+a2_n;
					
				}
			}
		}
		
		System.out.println(o +(a1_n + a2_n));

	}

}

import java.util.Scanner;
public class HM02_IF_ELSE_36 {

	public static void main(String[] args) {
		Scanner kb =new Scanner(System.in);
		String x = kb.next();
		String y = kb.next();
		String z = kb.next();
		int A1=0;int A2=0;int A3=0;
		int F1=0;int F2=0;int F3=0;
		for(int i = 0 ; i<3;i++) {
			if (x.charAt(i)=='A') {
				A1=A1+1;
			}if(y.charAt(i)=='A') {
				A2=A2+1;
			}if(z.charAt(i)=='A') {
				A3=A3+1;
			}
		}
		for(int i=0;i<3;i++) {
			if(x.charAt(i)=='F') {
				F1=F1+1;
			}if(y.charAt(i)=='F') {
				F2=F2+1;
			}if(z.charAt(i)=='F') {
				F3=F3+1;
			}
		}
		
		if(A1+A2+A3==8) {
			System.out.println("A");
		}else if(F1+F2+F3>4) {
			System.out.println("F");
		}else if(F2==2) {
			System.out.println("F");
		}else {
			System.out.println("X");
		}
		
	}

}

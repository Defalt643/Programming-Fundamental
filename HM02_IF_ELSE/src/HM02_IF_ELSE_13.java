import java.util.Scanner;
public class HM02_IF_ELSE_13 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double A,B,C,D,F;
		A=4;
		B=3;
		C=2;
		D=1;
		F=0;
		String x;
		x= kb.next();
		if(x.length()==1) {
			if(x.charAt(0)== 65) {
				System.out.println(A);
			}
			if(x.charAt(0)== 66) {
				System.out.println(B);
			}
			if(x.charAt(0)== 67) {
				System.out.println(C);
			}
			if(x.charAt(0)== 68) {
				System.out.println(D);
			}
			if(x.charAt(0)== 70) {
				System.out.println(F);
			}
		}
		if(x.charAt(1)==45) {
			if(x.charAt(0)== 65) {
				System.out.println(A-0.3);
			}
			if(x.charAt(0)== 66) {
				System.out.println(B-0.3);
			}
			if(x.charAt(0)== 67) {
				System.out.println(C-0.3);
			}
			if(x.charAt(0)== 68) {
				System.out.println(D-0.3);
			}
			if(x.charAt(0)== 70) {
				System.out.println(F-0.3);
			}
		}
		if(x.charAt(1)==43) {
			if(x.charAt(0)== 65) {
				System.out.println(A);
			}
			if(x.charAt(0)== 66) {
				System.out.println(B+0.3);
			}
			if(x.charAt(0)== 67) {
				System.out.println(C+0.3);
			}
			if(x.charAt(0)== 68) {
				System.out.println(D+0.3);
			}
			if(x.charAt(0)== 70) {
				System.out.println(F+0.3);
			}
		}
	}

}


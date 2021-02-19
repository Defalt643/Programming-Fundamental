import java.util.Scanner;
public class HM02_IF_ELSE_21 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String x = kb.next();
		char y = x.charAt(0);
		char z = x.charAt(1);
		int  i = Integer.parseInt(String.valueOf(z));
		
		if(y=='a') {
			if(i%2==1) {
				System.out.println("black");
			}else if(i%2==0) {
				System.out.println("white");
			}
		}if(y=='c') {
			if(i%2==1) {
				System.out.println("black");
			}else if(i%2==0) {
				System.out.println("white");
			}
		}if(y=='e') {
			if(i%2==1) {
				System.out.println("black");
			}else if(i%2==0) {
				System.out.println("white");
			}
		}if(y=='g') {
			if(i%2==1) {
				System.out.println("black");
			}else if(i%2==0) {
				System.out.println("white");
			}
		}if(y=='b') {
			if(i%2==0) {
				System.out.println("black");
			}else if(i%2==1) {
				System.out.println("white");
			}
		}if(y=='d') {
			if(i%2==0) {
				System.out.println("black");
			}else if(i%2==1) {
				System.out.println("white");
			}
		}if(y=='f') {
			if(i%2==0) {
				System.out.println("black");
			}else if(i%2==1) {
				System.out.println("white");
			}
		}if(y=='h') {
			if(i%2==0) {
				System.out.println("black");
			}else if(i%2==1) {
				System.out.println("white");
			}
		}

	}

}

import java.util.Scanner;
public class HM02_IF_ELSE_29 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String x = kb.next();
		if(x.charAt(0)=='5' && x.charAt(1)=='5' && x.charAt(2)=='5' && x.charAt(3)!='5' && x.charAt(4)!='5' && x.charAt(5)!='5') {
			System.out.println("hahaha");
		}else if(x.charAt(0)!='5' && x.charAt(1)=='5' && x.charAt(2)=='5' && x.charAt(3)=='5' && x.charAt(4)!='5' && x.charAt(5)!='5') {
			System.out.println("hahaha");
		}else if(x.charAt(0)!='5' && x.charAt(1)!='5' && x.charAt(2)=='5' && x.charAt(3)=='5' && x.charAt(4)=='5' && x.charAt(5)!='5') {
			System.out.println("hahaha");
		}else if(x.charAt(0)!='5' && x.charAt(1)!='5' && x.charAt(2)!='5' && x.charAt(3)=='5' && x.charAt(4)=='5' && x.charAt(5)=='5') {
			System.out.println("hahaha");
		}else {
			System.out.println("none");
		}

	}

}

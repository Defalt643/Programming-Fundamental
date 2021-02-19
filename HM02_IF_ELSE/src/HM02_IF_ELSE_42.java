import java.util.Scanner;
public class HM02_IF_ELSE_42 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String x = kb.next();
		if(x.charAt(0)=='S'&& x.charAt(1)=='C') {
			System.out.println("Science Building");
			System.out.println("Floor "+x.charAt(2));
			System.out.println("Room "+x.charAt(3)+x.charAt(4));
		}
		if(x.charAt(0)=='P'&& x.charAt(1)=='Y') {
			System.out.println("Physics Building");
			System.out.println("Floor "+x.charAt(2));
			System.out.println("Room "+x.charAt(3)+x.charAt(4));
		}
		if(x.charAt(0)=='E'&& x.charAt(1)=='N') {
			System.out.println("Engineering Building");
			System.out.println("Floor "+x.charAt(2));
			System.out.println("Room "+x.charAt(3)+x.charAt(4));
		}

	}

}

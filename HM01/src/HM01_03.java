import java.util.Scanner;
public class HM01_03 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String x;
		x=kb.next();
		if (x.length()>3 && x.length()<5) {
			System.out.print(x.charAt(0));
			System.out.print(",");
			System.out.print(x.charAt(1));
			System.out.print(x.charAt(2));
			System.out.print(x.charAt(3));
			
		}
		if (x.length()>4 && x.length()<6) {
			System.out.print(x.charAt(0));
			System.out.print(x.charAt(1));
			System.out.print(",");
			System.out.print(x.charAt(2));
			System.out.print(x.charAt(3));
			System.out.print(x.charAt(4));
		
		}
		if (x.length()>5 && x.length()<7) {
			System.out.print(x.charAt(0));
			System.out.print(x.charAt(1));
			System.out.print(x.charAt(2));
			System.out.print(",");
			System.out.print(x.charAt(3));
			System.out.print(x.charAt(4));	
			System.out.print(x.charAt(5));
		}else if (x.length()<4 )
			System.out.println(x);
		
	}
		
}

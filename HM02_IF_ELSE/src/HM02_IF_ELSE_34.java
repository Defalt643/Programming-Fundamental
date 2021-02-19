import java.util.Scanner;
public class HM02_IF_ELSE_34 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String x = kb.next();
		String y = kb.next();
		String z = kb.next();
		if(x.length()==y.length() && y.length()==z.length()) {
			System.out.println("All the same");
		}else if (x.length()==y.length() && y.length()!=z.length()) {
			System.out.println("Neither");
		}else if (x.length()!=y.length() && y.length()==z.length()) {
			System.out.println("Neither");
		}else {
			if(x.length()>y.length() && x.length()>z.length()) {
				System.out.println(x.length());
			}else if (y.length()>x.length() && y.length()>z.length()) {
				System.out.println(y.length());
			}else if (z.length()>x.length() && z.length()>y.length()) {
				System.out.println(z.length());
			}
		}

	}

}

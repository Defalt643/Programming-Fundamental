import java.util.Scanner;
public class HM01_16 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String x;
		x=kb.next();
		if (x.charAt(2)==49 || x.charAt(2)==54)
			System.out.println("yes");
		else
			System.out.println("no");
			
	}

}

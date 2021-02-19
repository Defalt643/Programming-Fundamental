import java.util.Scanner;
public class HM01_17 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String x;
		x=kb.next();
		if (x.length()==13)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}

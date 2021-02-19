import java.util.Scanner;
public class HM01_14 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		char x;
		x=kb.next().charAt(0);
		if (x==97 || x==101 || x==105 || x==111 || x==117)
			System.out.println("yes");
		else
			System.out.println("no");

	}

}

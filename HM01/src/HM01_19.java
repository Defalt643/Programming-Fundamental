import java.util.Scanner;
public class HM01_19 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x;
		char y;
		x=kb.nextInt();
		y=kb.next().charAt(0);
		if (x<18 || y ==115)
			System.out.println("20 B.");
		else
			System.out.println("50 B.");
		

	}

}

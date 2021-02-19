import java.util.Scanner;

public class HM04_LOOP_18 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int number = kb.nextInt();
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

	}
}

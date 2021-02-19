import java.util.Scanner;

public class HM04_LOOP_12 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		int most_even = 0;
		int most_odd = 0;

		do {
			if (x <= 0) {
				break;
			}
			if (x % 2 == 0) {
				if (x > most_even) {
					most_even = x;
				}

			} else if (x % 2 == 1) {
				if (x > most_odd) {
					most_odd = x;
				}
			}
			x = kb.nextInt();
		} while (x >= 0);
		System.out.println(most_odd);
		System.out.println(most_even);
		if (most_odd - most_even < 0) {
			System.out.println(most_even - most_odd);
		} else {
			System.out.println(most_odd - most_even);
		}

	}

}

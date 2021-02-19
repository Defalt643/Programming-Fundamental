import java.util.Scanner;

public class HM04_LOOP_16 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int A = 1, B = 3, C = 5, D = 7;
		int a, b, c, d;
		int count = 1;
		for (;;) {
			if (count == 10) {
				break;
			}
			a = kb.nextInt();
			b = kb.nextInt();
			c = kb.nextInt();
			d = kb.nextInt();
			if (a == A && b == B && c == C && d == D) {
				System.out.print(a + "/ " + b + "/ " + c + "/ " + d + "/");
				break;
			}
			if (a == A) {
				System.out.print(a + "/ ");
			}
			if (b == B) {
				System.out.print(b + "/ ");
			}
			if (c == C) {
				System.out.print(c + "/ ");
			}
			if (d == D) {
				System.out.print(d + "/");
			}
			if (a == B || a == C || a == D) {
				System.out.print(a + "x ");
			} else if (a != B && a != C && a != D && a != A) {
				System.out.print("- ");
			}
			if (b == A || b == C || b == D) {
				System.out.print(b + "x ");
			} else if (b != A && b != C && b != D && b != B) {
				System.out.print("- ");
			}
			if (c == B || c == A || c == D) {
				System.out.print(c + "x ");
			} else if (c != B && c != D && c != A && c != C) {
				System.out.print("- ");
			}
			if (d == B || d == C || d == A) {
				System.out.print(d + "x ");
			} else if (d != B && d != C || d != A && d != D) {
				System.out.print("-");
			}
			count = count + 1;
			System.out.println();
		}
		System.out.println();
		if (count < 10) {
			System.out.println("You win!! You spend " + count + " tries.");
		} else if (count == 10) {
			System.out.println("You lose!! You spend " + count + " tries.");
		}

	}

}

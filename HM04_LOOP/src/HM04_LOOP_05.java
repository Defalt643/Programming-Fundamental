import java.util.Scanner;

public class HM04_LOOP_05 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x;
		int even = 0;
		int odd = 0;
		do {
			x = kb.nextInt();
			if(x==-1) {
				break;
			}
			if (x % 2 == 0) {
				even = even + 1;
			} else {
				odd = odd + 1;
			}
		} while (x != -1);
		System.out.println(odd);
		System.out.println(even);

	}

}

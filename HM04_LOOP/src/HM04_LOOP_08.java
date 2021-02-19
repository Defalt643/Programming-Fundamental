import java.util.Scanner;

public class HM04_LOOP_08 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		char x;
		int y = 0;
		do {
			x = kb.next().charAt(0);
			if(x=='q') {
				break;
			}
			System.out.println((char) (x - 32));
			if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
				y = y + 1;
			}
		} while (x != 'q');
		System.out.println(y);

	}

}

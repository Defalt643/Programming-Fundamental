import java.util.Scanner;
public class HM04_LOOP_09 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		double total=0;
		double one =1;
		for(int i = 1;i<=x;i++) {
			total = total +(one/i);
		}System.out.printf("%.4f",total);

	}

}

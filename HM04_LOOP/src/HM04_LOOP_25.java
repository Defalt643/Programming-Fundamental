import java.util.Scanner;
public class HM04_LOOP_25 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		for(int i = 1 ;i<=x;i++) {
			for(int a = 1;a<=i;a++) {
				System.out.print(i+" ");
			}System.out.println();
		}

	}

}

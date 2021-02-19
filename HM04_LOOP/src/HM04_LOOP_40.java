import java.util.Scanner;
public class HM04_LOOP_40 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int m = kb.nextInt(),n = kb.nextInt(),odd = 1,even = n;
		for (int i = 1; i <= m; i++) {
			if (i % 2 == 1) {
				for (int o = 1; o <= n; o++) {
					System.out.print(odd + " ");
					odd += 1;
				}odd += n;
				System.out.println();
			}else{
				even += n;
				for(int p = 1; p <= n; p++){
					System.out.print(even + " ");
					even -= 1;
				}even += (n * 2);
				System.out.println();
			}
		}
	}
}

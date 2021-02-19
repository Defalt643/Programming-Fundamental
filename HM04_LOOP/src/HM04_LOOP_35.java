import java.util.Scanner;
public class HM04_LOOP_35 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		int y = x;
		for (int i = 1; i <= x; i++) {

			for (int o = 1; o <= x; o++) {
				if (y > o) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			y = y - 1;
		}for (int o = 1; o <= x; o++) {
			for (int z = 1; z <= x; z++) {
				if (o > 1) {
					if (z < o) {
						System.out.print("-");
					}else{
						System.out.print("*");
					}
				}
			}
			if(o > 1){
				System.out.println();
			}
		}
	}
}

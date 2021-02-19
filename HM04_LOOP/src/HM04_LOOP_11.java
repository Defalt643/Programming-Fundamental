import java.util.Scanner;

public class HM04_LOOP_11 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		for(int i = 1;i<=x;i++) {
			if(i%5==0) {
				System.out.print("X");
			}else {
				System.out.print("*");
			}
		}

	}

}

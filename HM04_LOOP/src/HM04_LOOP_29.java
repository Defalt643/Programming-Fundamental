import java.util.Scanner;

public class HM04_LOOP_29 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		int round = 0;
		int y=1;
		for (int i = x; i >0; i--) {
			if(y==x+1) {
				break;
			}
			round=0;
			do {
				System.out.print(i+" ");
				round =round+1;
			}while(round!=x);
			System.out.println();
			y=y+1;
		}

	}

}

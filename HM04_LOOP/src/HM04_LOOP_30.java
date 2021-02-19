import java.util.Scanner;
public class HM04_LOOP_30 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		for(int i =x;i>0;i--) {
			for(int a = i;a>=1;a--) {
				System.out.print(a+" ");
			}System.out.println();
		}

	}

}

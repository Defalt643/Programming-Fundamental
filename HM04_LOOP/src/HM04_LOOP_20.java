import java.util.Scanner;
public class HM04_LOOP_20 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x= kb.nextInt(),y=kb.nextInt();
		for(int i=1;i<=y;i++) {
			for(int a =1;a<=x;a++) {
				System.out.print(i+" ");
			}System.out.println();
		}

	}

}

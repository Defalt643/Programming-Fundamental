import java.util.Scanner;
public class HM04_LOOP_04 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		int y = kb.nextInt();
		int total =0;
		for(int i=x;i<=y;i++) {
			if(i%2==1) {
				System.out.printf(i+" ");
				total = total +i;
			}
		}System.out.println();
		System.out.println(total);

	}

}

import java.util.Scanner;
public class HM04_LOOP_26 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		int b=0;
		for(int i=x;i>0;i--) {
			b = b+1;
			for(int a = 1;a<=i;a++) {
				System.out.print(b+" ");
			}System.out.println();
		}
		
	}

}

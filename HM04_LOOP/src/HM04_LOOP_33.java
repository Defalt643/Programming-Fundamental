import java.util.Scanner;
public class HM04_LOOP_33 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		for(int i =1 ;i<=x;i++) {
			for(int a=1;a<=x;a++) {
				if(a==i || a>i) {
					System.out.print("*");
				}else {
					System.out.print("-");
				}
			}for(int b=x;b>1;b--) {
				if(i<b) {
					System.out.print("*");
				}else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

}

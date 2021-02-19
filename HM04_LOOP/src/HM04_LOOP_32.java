import java.util.Scanner;
public class HM04_LOOP_32 {

	public static void main(String[] args) {
		Scanner  kb = new Scanner(System.in);
		int x=kb.nextInt();
		for(int i = 1 ;i<=x;i++) {
			for(int a =1;a<=x;a++) {
				if(i==1) {
					System.out.print(i);
				}else if(a==1) {
					System.out.print(i);
				}else if(a==x) {
					System.out.print(i);
				}else if(i==x) {
					System.out.print(i);
				}else {
					System.out.print("-");
				}
			}System.out.println();
		}
	}

}

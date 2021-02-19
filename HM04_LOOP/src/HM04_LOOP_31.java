import java.util.Scanner;
public class HM04_LOOP_31 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		for(int i = 1;i<=x;i++) {
			for(int a = 1; a<=x*2-1;a++) {
				if(i==1 && a%2==1) {
					System.out.print("*");
				}else if(a==x*2-1) {
					System.out.print("*");
				}else if(a==1) {
					System.out.print("*");
				}else if(i==x && a%2==1){
					System.out.print("*");
				}else if(a%2==1) {
					System.out.print("-");
				}else {
					System.out.print(" ");
				}
				
				
			}System.out.println();
		}

	}

}

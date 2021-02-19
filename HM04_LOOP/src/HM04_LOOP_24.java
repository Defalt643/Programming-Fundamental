import java.util.Scanner;
public class HM04_LOOP_24 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x=kb.nextInt(),y=kb.nextInt();
		for(int i = 1 ;i<=y;i++) {
			for(int a =1;a<=x;a++) {
				if(i==1) {
					System.out.print("+");
				}else if(a==1) {
					System.out.print("+");
				}else if(a==x) {
					System.out.print("+");
				}else if(i==y) {
					System.out.print("+");
				}else {
					System.out.print("-");
				}
			}System.out.println();
		}
				
			
		
	}

}

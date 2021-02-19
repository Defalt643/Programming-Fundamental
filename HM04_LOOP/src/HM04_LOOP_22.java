import java.util.Scanner;
public class HM04_LOOP_22 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x =kb.nextInt(),round=0;
		
		for(int i =1;i<=x;i++) {
			if(round%2==0) {
				for(int a =1;a<=x;a++) {
					System.out.print(">");
				}System.out.print(" ");
				for(int a =1;a<=x;a++) {
					System.out.print("<");
				}System.out.println();
			}else {
				for(int a =1;a<=x;a++) {
					System.out.print("<");
				}System.out.print(" ");
				for(int a =1;a<=x;a++) {
					System.out.print(">");
				}System.out.println();
			}round=round+1;
		}

	}

}

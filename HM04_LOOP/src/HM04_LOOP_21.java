import java.util.Scanner;
public class HM04_LOOP_21 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x=kb.nextInt(),y=kb.nextInt();
		for(int i=1;i<=x;i++) {
			for(int a =1;a<=y/2;a++) {
				System.out.print(">");
			}for(int b =1;b<=y/2;b++) {
				System.out.print("<");
			}System.out.println();
			
		}

	}

}

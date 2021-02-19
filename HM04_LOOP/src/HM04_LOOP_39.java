import java.util.Scanner;
public class HM04_LOOP_39 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		for(int i=1;i<=x;i++) {
			for(int a=1;i<=x;i++) {
				System.out.print("...*...");
			}System.out.println();
			for(int b=1;b<=x;b++) {
				System.out.print("..*.*..");
			}System.out.println();
			for(int c=1;c<=x;c++) {
				System.out.print(".*...*.");
			}System.out.println();
			for(int d=1;d<=x;d++) {
				System.out.print("*.....*");
			}
		}

	}

}

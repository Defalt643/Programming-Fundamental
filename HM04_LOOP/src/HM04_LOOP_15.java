import java.util.Scanner;
public class HM04_LOOP_15 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		for(int i =0;i<x;i++) {
			System.out.print("*");
		}System.out.println();
		for(int i =0;i<x-2;i++) {
			if(x<0) {
				break;
			}System.out.print("*");
		}System.out.println();
		for(int i =0;i<x-4;i++) {
			System.out.print("*");
			
		}

	}

}

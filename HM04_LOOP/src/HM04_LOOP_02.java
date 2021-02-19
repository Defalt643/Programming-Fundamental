import java.util.Scanner;
public class HM04_LOOP_02 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		
		for(int i =0; i<x;i++) {
			double y = kb.nextDouble();
			System.out.printf("%.0f\n",Math.pow(y, y));
		}

	}

}

import java.util.Scanner;
public class HM02_IF_ELSE_46 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		int y = kb.nextInt();
		int z = kb.nextInt();
		double avg=(x+y+z)/12.00;
		System.out.printf("%.2f",avg);
	}
}

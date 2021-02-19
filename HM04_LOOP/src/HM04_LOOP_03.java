import java.util.Scanner;
public class HM04_LOOP_03 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		double y=0;
		for(int i = 1 ; i<=x ; i++) {
			y = y+(Math.pow(i,2));
		}System.out.printf("%.0f",y);
		

	}

}

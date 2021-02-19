import java.util.Scanner;
public class HM04_LOOP_10 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String x = kb.next();
		for(int i = x.length()-1 ;i>=0;i--) {
			System.out.print(x.charAt(i));
		}

	}

}

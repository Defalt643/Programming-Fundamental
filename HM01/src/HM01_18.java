import java.util.Scanner;
public class HM01_18 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x,y;
		x=kb.nextInt();
		y=kb.nextInt();
		if (x+y > 49) {
			System.out.println(x+y);
			System.out.println("pass");
		}else {
			System.out.println(x+y);
			System.out.println("fail");
		}

	}

}

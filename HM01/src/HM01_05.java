import java.util.Scanner;
public class HM01_05 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double f,c;
		f = kb.nextDouble();
		f = f-32;
		c = f*5/9;
		System.out.println(c);

	}

}

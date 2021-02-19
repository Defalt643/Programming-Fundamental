import java.util.Scanner;
public class Lab03_01 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double y;
		double x;
		double z;
		x = kb.nextDouble();
		y = kb.nextDouble();
		z = x*y;
		System.out.printf("%.2f\n", x);
		System.out.printf("%.2f\n", y);
		System.out.printf("%.2f", z);
	}

}

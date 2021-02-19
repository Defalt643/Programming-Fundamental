import java.util.Scanner;
public class HM02_IF_ELSE_51 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		int y = kb.nextInt();
		int z = kb.nextInt();
		int area = x*y;
		int flower = area*5;
		int price = flower*z;
		System.out.println(flower);
		System.out.println(price);

	}

}

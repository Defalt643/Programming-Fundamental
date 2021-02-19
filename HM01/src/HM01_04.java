import java.util.Scanner;
public class HM01_04 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String name = kb.next();
		System.out.print(name.toLowerCase().charAt(4));
		System.out.print(name.toLowerCase().charAt(3));
		System.out.print(name.toLowerCase().charAt(2));
		System.out.print(name.toLowerCase().charAt(1));
		System.out.print(name.toLowerCase().charAt(0));
	}

}

import java.util.Scanner;
public class HM03_SIMPLE_LOOP_03 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		int z = 0;
		for(int i =0;i<x;i++) {
			int y =kb.nextInt();
			z=z+y;
		}
		System.out.println(z);

	}

}

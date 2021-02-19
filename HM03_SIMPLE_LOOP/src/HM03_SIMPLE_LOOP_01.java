import java.util.Scanner;
public class HM03_SIMPLE_LOOP_01 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x= kb.nextInt();
		double z=0;
		for(int i = 0;i<x;i++) {
			double y =kb.nextDouble();
			z = z+y;
			
		}
		double o = z/x;
		System.out.printf("%.2f",o);
		
	}

}

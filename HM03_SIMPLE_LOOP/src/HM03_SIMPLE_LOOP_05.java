import java.util.Scanner;
public class HM03_SIMPLE_LOOP_05 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double x = kb.nextInt();
		int z = kb.nextInt();
		int o=z;
		int a=z;
		double total=0;
		for(int i = 0 ; i<x-1;i++) {
			int y=kb.nextInt();
			total=total+y;
			if(z<y) {
				z=y;
			}else if (o>y) {
				o=y;
			}
		}
		double avg = (total+a)/x;
		System.out.println(z);
		System.out.println(o);
		System.out.printf("%.2f",avg);
	}

}

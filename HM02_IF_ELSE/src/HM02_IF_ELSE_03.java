import java.util.Scanner;
public class HM02_IF_ELSE_03 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		char type;
		double unit,total;
		type = kb.next().charAt(0);
		unit = kb.nextDouble();
		if (type == 100) {
			if(unit < 200) {
				System.out.printf("%.2f",unit*2.5);
			}
			if(unit > 199) {
				System.out.printf("%.2f",unit*2.75);
			}
		}
		if(type == 104) {
			if(unit < 200) {
				System.out.printf("%.2f",unit*1.75);
			}
			if(unit > 199) {
				System.out.printf("%.2f",unit*2.00);
			}
		}
	}

}

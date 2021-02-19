import java.util.Scanner;
public class HM02_IF_ELSE_37 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String x = kb.next();
		int y=0;
		int z=0;
		for (int i = 0;i<5;i++) {
			if(x.charAt(i)=='H') {
				y=i;
			}if(x.charAt(i)=='X') {
				z=i;
			}
		}
		if(y>z) {
			System.out.println("R"+(y-z));
		}else if(z>y) {
			System.out.println("L"+(z-y));
		}
		

	}

}

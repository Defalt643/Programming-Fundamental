import java.util.Scanner;
public class HM02_IF_ELSE_23 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		char y = kb.next().charAt(0);
		
		if(y=='C') {
			if(x<1) {
				System.out.println("Solid");
			}else if (x>0 && x<100) {
				System.out.println("Liquid");
			}else if (x>99) {
				System.out.println("Gas");
			}
		}if(y=='F') {
			if(x<33) {
				System.out.println("Solid");
			}else if (x>32 && x<213) {
				System.out.println("Liquid");
			}else if (x>212) {
				System.out.println("Gas");
			}
		}
	}

}

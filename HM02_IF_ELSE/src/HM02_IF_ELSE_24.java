import java.util.Scanner;
public class HM02_IF_ELSE_24 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		int y = kb.nextInt();
		
		if(x<1991) {
			if(y<1501) {
				System.out.println("1250");
			}else if(y>1500 && y<=2000) {
				System.out.println("1400");
			}else if(y>2000) {
				System.out.println("2000");
			}
		}else if(x>1990 && x<2000) {
			if(y<1501) {
				System.out.println("1100");
			}else if(y>1500 && y<=2000) {
				System.out.println("1300");
			}else if(y>2000) {
				System.out.println("1700");
			}
		}else if(x>1999) {
			if(y<1501) {
				System.out.println("1000");
			}else if(y>1500 && y<=2000) {
				System.out.println("1200");
			}else if(y>2001) {
				System.out.println("1500");
			}
		}

	}

}

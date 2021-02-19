import java.util.Scanner;
public class HM02_IF_ELSE_44 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		int y = kb.nextInt();
		
		if(x==y) {
			System.out.println("Cake");
		}else if (x/2==y) {
			System.out.println("Cookie");
		}else if (y==x*5) {
			System.out.println("Toffy");
		}else {
			System.out.println("Unknown");
		}

	}

}

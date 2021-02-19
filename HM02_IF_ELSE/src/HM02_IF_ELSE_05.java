import java.util.Scanner;
public class HM02_IF_ELSE_05 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		char x = kb.next().charAt(0);
		int y = kb.nextInt();
		
		if (x==72 && y==4567) {
			System.out.println("safe unlocked");
		}else {
			if(x==72 && y!=4567) {
				System.out.println("safe locked - change digit");
			}
			if(x!=72 && y==4567) {
				System.out.println("safe locked - change char");
			}
			if(x!=72 && y!=4567) {
				System.out.println("safe locked");
			}
		}
		

	}

}

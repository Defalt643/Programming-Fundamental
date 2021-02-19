import java.util.Scanner;
public class HM02_IF_ELSE_52 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		int y = kb.nextInt();
		int z = kb.nextInt();
		int total = (x+y+z)%3;
		
		if(total==0) {
			System.out.println("bad");
		}else if(total==1) {
			System.out.println("ok");
		}else if(total==2) {
			System.out.println("lucky");
		}

	}

}

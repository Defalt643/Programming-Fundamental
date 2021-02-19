import java.util.Scanner;
public class HM02_IF_ELSE_12 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x,y,z;
		x = kb.nextInt();
		y = kb.nextInt();
		z = kb.nextInt();
		if(x>y && y>z) {
			System.out.println("decreasing");
		}else {
			if(x<y && y<z) {
			System.out.println("increasing");
			}else {
			System.out.println("neither");
		}
		
		
		}

	}

}

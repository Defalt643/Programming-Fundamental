import java.util.Scanner;
public class HM02_IF_ELSE_11 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x,y,z;
		x = kb.nextInt();
		y = kb.nextInt();
		z = kb.nextInt();
		
		if(x==y && x==z) {
			System.out.println("all the same");
		}
		if(y==z && y!=x ||(x==z && x!=y)) {
			System.out.println("neither");
		}
		if(x!=z && y!=z && y!=x) {
			System.out.println("all different");
		}
		if(x==y & x!=z) {
			System.out.println("neither");
		}
	}

}

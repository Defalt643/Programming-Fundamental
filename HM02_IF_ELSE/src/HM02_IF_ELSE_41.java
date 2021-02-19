import java.util.Scanner;
public class HM02_IF_ELSE_41 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x,y,z,o;
		x=kb.nextInt();
		y=kb.nextInt();
		z=kb.nextInt();
		o=kb.nextInt();
		if(x>450 || y>450 || z>450 || o>450) {
			if(x>y && x>z && x>o) {
				System.out.println(x+" YES");
			}
			if(y>x && y>z && y>o) {
				System.out.println(y+" YES");
			}
			if(z>x && z>y && z>o) {
				System.out.println(z+" YES");
			}
			if(o>x && o>z && o>y) {
				System.out.println(o+" YES");
			}
		}else {
			if(x>y && x>z && x>o) {
				System.out.println(x+" NO");
			}
			if(y>x && y>z && y>o) {
				System.out.println(y+" NO");
			}
			if(z>x && z>y && z>o) {
				System.out.println(z+" NO");
			}
			if(o>x && o>z && o>y) {
				System.out.println(o+" NO");
			}
		}

	}

}

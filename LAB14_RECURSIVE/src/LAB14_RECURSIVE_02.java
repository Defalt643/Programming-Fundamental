import java.util.Scanner;
public class LAB14_RECURSIVE_02 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x =kb.nextInt(),y=kb.nextInt();
		System.out.println(gcd(x,y));

	}public static int gcd(int x,int y) {
		if(x<y) {
			return gcd(y,x);
		}else if(y==0) {
			return x;
		}else {
			return gcd(y,x%y);
		}
	}

}

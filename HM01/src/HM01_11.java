import java.util.Scanner;
public class HM01_11 {

	public static void main(String[] args) {
		int x,y,z;
		Scanner kb = new Scanner(System.in);
		x= kb.nextInt();
		y= kb.nextInt();
		z= kb.nextInt();
		if (x>4 && y>19 && z>24)
			System.out.println("pass");
		else
			System.out.println("fail");

	}

}

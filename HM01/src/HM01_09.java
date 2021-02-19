import java.util.Scanner;
public class HM01_09 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x,y,z;
		x = kb.nextInt();
		y = kb.nextInt();
		z = kb.nextInt();
		if (x<y && x<z)
			System.out.println(x);
		if (y<x && y<z)
			System.out.println(y);
		if (z<x && z<y)
			System.out.println(z);
	}

}

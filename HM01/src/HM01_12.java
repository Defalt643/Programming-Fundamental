import java.util.Scanner;
public class HM01_12 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x,y;
		char a;
		a=kb.next().charAt(0);
		x=kb.nextInt();
		y=kb.nextInt();
		if (a==84)
			System.out.println("Area of the triangle = "+((x*y)/2));
		else
			System.out.println("Area of the rectangle = "+(x*y));
		
	}

}

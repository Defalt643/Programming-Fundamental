import java.util.Scanner;
public class HM01_13 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x,y;
		x=kb.nextInt();
		y=kb.nextInt();
		if(x%y==0)
			System.out.println(x+" is divisible by "+y);
		else
			System.out.println(x+" is indivisible by "+y);

	}

}

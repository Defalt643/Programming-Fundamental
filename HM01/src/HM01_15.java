import java.util.Scanner;
public class HM01_15 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int y;
		String x;
		x=kb.next();
		y=0;
		if (x.charAt(0)==97 || x.charAt(0)==101 || x.charAt(0)==105 || x.charAt(0)==111 || x.charAt(0)==117)
			y=y+1;
		if (x.charAt(1)==97 || x.charAt(1)==101 || x.charAt(1)==105 || x.charAt(1)==111 || x.charAt(1)==117)
			y=y+1;
		if (x.charAt(2)==97 || x.charAt(2)==101 || x.charAt(2)==105 || x.charAt(2)==111 || x.charAt(2)==117)
			y=y+1;
		System.out.println(y);
	}

}

import java.util.Scanner;
public class HM02_IF_ELSE_20 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String x = kb.next();
		char a =kb.next().charAt(0);
		
		int y = Integer.parseInt(x);
		char z = x.charAt(0);
		char o = x.charAt(1);
		
		int y1= Character.getNumericValue(o)*10;
		int y2= Character.getNumericValue(z);
		int mix =y1+y2;
		
		if(a=='+') {
			System.out.println(y+" + "+mix+" = "+(y+mix));
		}else if(a=='*') {
			System.out.println(y+" * "+mix+" = "+(y*mix));
		}
		
	

	}

}

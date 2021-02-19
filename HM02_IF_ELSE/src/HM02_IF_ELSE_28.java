import java.util.Scanner;
public class HM02_IF_ELSE_28 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x,y,z,odd,even;
		x= kb.nextInt();
		y= kb.nextInt();
		z= kb.nextInt();
		even=0;
		odd=0;
		if((x%2)==0) {
			even=even+1;
		}else {
			odd=odd+1;
		}if((y%2)==0) {
			even=even+1;
		}else {
			odd=odd+1;
		}if((z%2)==0) {
			even=even+1;
		}else {
			odd=odd+1;
		}
		System.out.println("even "+even);
		System.out.println("odd "+odd);
	}

}

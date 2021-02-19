import java.util.Scanner;
public class HM02_IF_ELSE_02 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		int x1=x;
		int y = kb.nextInt();
		int y1=y;
		int z = kb.nextInt();
		int z1=z;
		int a = kb.nextInt();
		int a1=a;
		int b = kb.nextInt();
		int b1=b;
		int c = kb.nextInt();
		int c1=c;
		
		if (x%2==0 || z%2==0) {
			x=a1;
			a=x1;
		}if(y%2!=0 || b%2!=0) {
			y=b1;
			b=y1;
		}
		z=c1;
		c=z1;
		int total_a=x+y+z;
		int total_b=a+b+c;
		if(total_a>total_b) {
			System.out.println("A "+x+" "+y+" "+z);
		}else if (total_b>total_a) {
			System.out.println("B "+a+" "+b+" "+c);
		}else if(total_a==total_b) {
			System.out.println("A "+x+" "+y+" "+z);
			System.out.println("B "+a+" "+b+" "+c);
		}

	}

}

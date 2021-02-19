import java.util.Scanner;
public class Lab03_03 {
	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	int x,x1,y,z,o;
	x = kb.nextInt();
	if (x>10) {
		x1=x/10;
		x=x-(x1*10);
		if (x > 5) {
			y=x/5;
			x=x-(y*5);
		if (x>2) {
			z=x/2;
			x=x-(z*2);
		if (x>1) {
			o=x/1;
			x=x-(o);
		}
		}
		}
		}
			
		System.out.println("10 baht "+x1);
		System.out.println("5 baht "+y);
		System.out.println("2 baht "+z);
		System.out.println("1 baht "+o);
		
	
	}
}
		
				


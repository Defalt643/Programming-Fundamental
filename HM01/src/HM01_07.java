import java.util.Scanner;
public class HM01_07 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x,t,f,two;
		x=kb.nextInt();
		t=x/10;
		x=x-(t*10);
		f=x/5;
		x=x-(f*5);
		two = x/2;
		x= x-(two*2);

		System.out.println("10 baht = "+t);
		System.out.println("5 baht = "+f);
		System.out.println("2 baht = "+two);
		System.out.println("1 baht = "+x);
		
			

	}
}

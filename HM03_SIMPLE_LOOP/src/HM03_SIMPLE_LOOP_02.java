import java.util.Scanner;
public class HM03_SIMPLE_LOOP_02 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int  x = kb.nextInt();
		int  z =0;
		
		for(int i=0;i<x;i++) {
			char y = kb.next().charAt(0);
			if (y =='A' || y=='E' || y=='I' || y=='O'|| y=='U') {
				z=z+1;
			}
			
			
		}
		System.out.println(z);
		
	}
	

}

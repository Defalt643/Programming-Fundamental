import java.util.Scanner;
public class HM03_SIMPLE_LOOP_04 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		int y = kb.nextInt();
		for(int i = 0 ; i<x-1 ; i++) {
			int z = kb.nextInt();
			if(y<z) {
				y=z;
				
			}
			
		}
		System.out.println(y);
	}

}

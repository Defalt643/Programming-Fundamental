import java.util.Scanner;
public class HM03_SIMPLE_LOOP_09 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		int y = kb.nextInt();
		
		for(int i =x;i<y+1;i++) {
			if(i%10==0 ||i%999==0) {
				System.out.println(i);
			}
		}
	}

}

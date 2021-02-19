import java.util.Scanner;
public class HM03_SIMPLE_LOOP_06 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		int num=0;
		for(int i=0;i<x;i++) {
			int y = kb.nextInt();
			if (y==0) {
				num=num+1;
			}
		}
		System.out.println(num);

	}

}

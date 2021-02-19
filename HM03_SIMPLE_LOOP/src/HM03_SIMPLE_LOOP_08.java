import java.util.Scanner;
public class HM03_SIMPLE_LOOP_08 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		int y = kb.nextInt();
		for (int i=x;i<y+1;i++) {
			int z =i;
			String o = Integer.toString(z);
			if(i%7==0 || o.charAt(o.length()-1)=='9') {
				System.out.println(i);
			}
		}

	}

}

import java.util.Scanner;
public class HM03_SIMPLE_LOOP_07 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		for(int i =1;i<13;i++) {
			System.out.println(x+" * "+i+" = "+(x*i));
		}

	}

}

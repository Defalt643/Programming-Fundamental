import java.util.Scanner;
public class HM04_LOOP_07 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		for (int i = x ; i>=0;i--){
			if(i%10==0) {
				System.out.print(i+" ");
			}
		}
	}
}

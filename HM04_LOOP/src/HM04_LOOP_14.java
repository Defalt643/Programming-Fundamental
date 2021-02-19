import java.util.Scanner;

public class HM04_LOOP_14 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		int y,z;
		int most = 0;
		int total=0;
		int count=0;
		for (int i = 0; i < x; i++) {
			y=kb.nextInt();
			z=kb.nextInt();
			if(y>z) {
				most=y;
			}else {
				most=z;
			}total=total+most;
			count = count+1;
			System.out.print(most);
			if(count<x){
				System.out.print(" + ");
			}
			
		}System.out.print(" = "+total);
	}

}

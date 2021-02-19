import java.util.Scanner;
public class HM04_LOOP_17 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x=kb.nextInt(),y=kb.nextInt(),total=0;
	
		for(int i=x;i<=y;i++) {
			System.out.print(i+" ");
			if(i%2==1) {
				total=total+i;
			}
		}System.out.println();
		System.out.println(total);

	}

}

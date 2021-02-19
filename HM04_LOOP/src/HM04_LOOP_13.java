import java.util.Scanner;
public class HM04_LOOP_13 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x,y,z;
		int same=1,most_same=0;
		for(;;) {
			x=kb.nextInt();
			if(x==0) {
				break;
			}y=kb.nextInt();
			if(y==0) {
				break;
			}if(x!=y) {
				same=1;
			}if(x==y) {
				same=same+1;
				if(same>most_same) {
					most_same=same;
				}
			}
		}System.out.println(most_same+1);
	}

}

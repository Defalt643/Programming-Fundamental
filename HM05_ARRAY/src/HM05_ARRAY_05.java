import java.util.Scanner;
public class HM05_ARRAY_05 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x =kb.nextInt(),y[]=new int[x],same=0;
		for(int i=0;i<x;i++) {
			y[i]=kb.nextInt();
		}int z=kb.nextInt();
		for(int i=0;i<x;i++) {
			if(y[i]==z) {
				same=same+1;
			}
		}System.out.println(same);

	}

}

import java.util.Scanner;
public class HM05_ARRAY_03 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x =kb.nextInt(),total=0,min=Integer.MAX_VALUE;
		int y[]=new int[x];
		for(int i=0;i<x;i++) {
			y[i]=kb.nextInt();
			total=total+y[i];
		}for(int i=0;i<x;i++) {
			if(y[i]<min) {
				min=y[i];
			}
		}total=total-min;
		System.out.println(total);
	}

}

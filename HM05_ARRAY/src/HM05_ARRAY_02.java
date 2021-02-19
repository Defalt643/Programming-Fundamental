import java.util.Scanner;
public class HM05_ARRAY_02 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x[]=new int[10],y[]=new int[100];
		for(int i=0;i<10;i++) {
			x[i]=kb.nextInt();
			for(int a=x[i];;) {
				y[a]=y[a]+1;
				break;
			}
		}for(int i=0;i<100;i++) {
			if(y[i]==1) {
				System.out.print(x[i]+" ");
			}
		}
		
	}

}

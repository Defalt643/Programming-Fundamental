import java.util.Scanner;
public class HM05_ARRAY_27 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int y =kb.nextInt(),x=kb.nextInt();
		int z[][]=new int[x][y],b[]=new int[100];
		double a[]=new double[100];
		for(int i=0;i<100;i++) {
			b[i]=i;
		}for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				z[i][j]=kb.nextInt();
			}
		}for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				for(int A=0;A<100;A++) {
					if(z[i][j]!=0) {
						if(z[i][j]==b[A]) {
						a[A]=a[A]+1;
						}
					}
				}
			}
		}for(int i=1;i<100;i++) {
			if(a[i]!=0) {
				System.out.printf(i+" %.0f",Math.ceil(a[i]/200));
				System.out.println();
			}
		}
	}
}
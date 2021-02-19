import java.util.Scanner;
public class HM05_ARRAY_12 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x=kb.nextInt();
		int y[][]=new int[x][x];
		for(int i=0;i<x;i++) {
			for(int j=0;j<x;j++) {
				y[i][j]=kb.nextInt();
			}
		}for(int j=0;j<x;j++) {
			for(int i=0;i<x;i++) {
			System.out.print(y[i][j]+" ");
		}System.out.println();
		}
		
	}

}

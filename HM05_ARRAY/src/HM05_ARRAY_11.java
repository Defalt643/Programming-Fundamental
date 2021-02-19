import java.util.Scanner;
public class HM05_ARRAY_11 {

	public static void main(String[] args) {
		Scanner kb =new Scanner(System.in);
		int x =kb.nextInt(),same=0;
		int y[][]=new int[x][x];
		for(int i=0;i<x;i++) {
			for(int j=0;j<x;j++) {
				y[i][j]=kb.nextInt();
			}
		}for(int i=0;i<x-1;i++) {
			for(int j=0;j<x-1;j++) {
				if(y[i][j]==y[i+1][j+1]&&y[i][j]==1) {
					same=same+1;
				}
			}
		}if(same==x-1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}

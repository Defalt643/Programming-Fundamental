import java.util.Scanner;
public class Lab12_02 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x =kb.nextInt(),y[][]= new int[x][10];
		int z[]= {1,2,3,4,1,2,3,4,1,2},count=0;
		for(int i=0;i<x;i++) {
			for(int j=0;j<10;j++) {
				y[i][j]=kb.nextInt();
			}
		}for(int i = 0;i<x;i++ ) {
			count=0;
			for(int j=0;j<10;j++) {
				if(y[i][j]==z[j]) {
					count=count+1;
				}
			}System.out.println(count);
		}

	}

}

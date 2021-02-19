import java.util.Scanner;
public class Lab12_01 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt(),y[][]=new int[x][x],z[]=new int[x];
		for(int i=0;i<x;i++) {
			for(int j=0;j<x;j++) {
				y[i][j]=kb.nextInt();
			}
		}char io=kb.next().charAt(0);
		for(int i=0;i<x;i++) {
			int o=0;
			if(io=='r') {
				for(int j=x-1;j>=0;j--) {
					z[i]=y[i][j]+z[i];
				}
			}else if(io=='c') {
				for(int j =x-1;j>=0;j--) {
					z[i]=z[i]+y[j][i];
				}
				
				
			}System.out.println(z[i]);
			
		}

	}

}

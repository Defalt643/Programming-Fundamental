import java.util.Scanner;

public class HM05_ARRAY_13 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x[][] = new int[3][3],one=0,zero=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				x[i][j] = kb.nextInt();
			}
		}for(int i=0;i<3;i++) {
			one=0;
			zero=0;
			for(int j=0;j<3;j++) {
				if(x[i][j]==0) {
					zero=zero+1;
				}if(x[i][j]==1) {
					one =one+1;
				}
			}if(one==3) {
				System.out.println("All 1 on row "+i);
			}if(zero==3) {
				System.out.println("All 0 on row "+i);
			}
		}
		for(int j=0;j<3;j++) {
			one=0;
			zero=0;
			for(int i=0;i<3;i++) {
				if(x[i][j]==0) {
					zero=zero+1;
				}
				if(x[i][j]==1) {
					one=one+1;
				}if(one==3) {
					System.out.println("All 1 on column "+j);
				}if(zero==3) {
					System.out.println("All 0 on column "+j);
				}
			}
		}
	}
}

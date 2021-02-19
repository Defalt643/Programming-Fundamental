import java.util.Scanner;
public class Test_LOOP {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x =kb.nextInt();
		for(int a = 1;a<=x;a++) {
			int n = kb.nextInt();
			for(int i=1;i<=n+2;i++) {
				for(int j=1;j<=n+2;j++) {
					if(j>n+2-i) {
						System.out.print("#");
					}else {
						System.out.print(".");
					}
				}
				for(int j=1;j<=n+2;j++) {
					if(j>1 && j<n+2 &&i!=1 && i!=n+2){
						System.out.print("#");
					}else {
						System.out.print("+");
					}
					
					
					
				}System.out.println();
			}
			for(int i=1;i<=n+2;i++) {
				for(int j=1;j<=n+2;j++) {
					if(j>1 && j<n+2 &&i!=1 && i!=n+2){
						System.out.print("+");
					}else {
						System.out.print("#");
					}
				}
				for(int j=1;j<=n+2;j++) {
					if(j>n+3-i) {
						System.out.print(".");
					}else {
						System.out.print("+");
					}
				}System.out.println();
			
			}
		}

	}

}

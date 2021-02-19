import java.util.Scanner;
public class HM05_ARRAY_06 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x[]=new int[10];
		for(int i=0;i<10;i++) {
			x[i]=kb.nextInt();
		}int b[]=x.clone();
		int y=kb.nextInt();
		if(y==1) {
			int z=kb.nextInt();
			int o=kb.nextInt();
			x[z-1]=o+1;
			for(int i=0;i<10;i++) {
				if(x[i]>=z) {
					System.out.print((x[i]-1)+" ");
				}else {
					System.out.print(x[i]+" ");
				}
			}
		}else if(y==2) {
			int z=kb.nextInt();
			for(int i=z-1;z<10-1;z++) {
				x[i]=b[i+1];
			}x[9]=0;
			for(int i=0;i<10;i++) {
				System.out.print(x[i]+" ");
			}
		}

	}

}

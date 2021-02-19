import java.util.Scanner;
public class HM05_ARRAY_15 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x[][]=new int[5][5],normal=0,honey=0,vip=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i<3) {
					x[i][j]=10;
				}else if(i==3) {
					x[i][j]=20;
				}else {
					x[i][j]=30;
				}
			}
		}for(;;) {
			int y=kb.nextInt();
			int z=kb.nextInt();
			if(y==-1 &&z==-1) {
				break;
			}z=z-1;y=y-1;
			if(x[y][z]==0) {
				System.out.println("booked");
			}else {
				x[y][z]=0;
				System.out.println("reserved OK");
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(x[i][j]+" ");
				if(i<3) {
					if(x[i][j]==0) {
						normal=normal+1;
					}
				}else if(i==3) {
					if(x[i][j]==0) {
						honey=honey+1;
					}
				}else if(i==4) {
					if(x[i][j]==0) {
						vip=vip+1;
					}
				}
			}System.out.println();
		}System.out.println("Normal type : "+normal*10);
		System.out.println("Honeymoon type : "+honey*20);
		System.out.println("VIP type : "+vip*30);
	}
}
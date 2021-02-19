import java.util.Scanner;
public class HM05_ARRAY_27_BACKUP {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x =kb.nextInt(),y=kb.nextInt(),z[]=new int[x*y];
		int o[]=new int[100],count[]=new int[100];
		for(int i=0;i<x*y;i++) {
			z[i]=kb.nextInt();
			
		}for(int i =0;i<100;i++) {
			o[i]=i+1;
		}for(int i =0;i<x*y;i++) {
			for(int a = 0;a<100;a++) {
				if(z[i]!=0) {
					if(z[i]==o[a]) {
					count[a]=count[a]+1;
					}
				}
				
			}
		}for(int i=0;i<x*y;i++) {
			for(int a = 0;a<100;a++) {
				if(z[i]!=0) {
					if(count[a]<100) {
						System.out.println(z[i]+" "+1);
					}else if(count[a]>99 && count[a]<200) {
						System.out.println(z[i]+" "+2);
					}else if(count[a]>199 && count[a]<300) {
						System.out.println(z[i]+" "+3);
					}
				}
			}
			
		}
		

	}

}

import java.util.Scanner;
public class HM04_LOOP_36 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		for (int i = 1; i <= x; i++){
			for (int o = 1;o <= x;o++){
				if(o <= i){
					System.out.print(o);
				}
			}System.out.println();
			
		}
		for(int a = x; a >= 1; a--){
			for(int y = 1; y <= x; y++){
				if(a != x) {
					if(y <= a){
						System.out.print(y);
					}
				}
			}
			if(a != x){
				System.out.println();
			}
		}
	}
}

import java.util.Scanner;
public class HM04_LOOP_37 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();

		for (int i = 1; i < x; i++) {
			for (int o = 1; o <= x;o++){
				if (o > i) {
					System.out.print("-");
				} else {
					System.out.print("A");
				}
			}
			for(int y = x; y > 0;y--){
				if(y > i) {
					System.out.print("-");
				}else{
					System.out.print("A");
				}
			}System.out.println();
		}
		for(int z =x; z > 0; z--){
			for(int a = 1; a <= x; a++){
				if(z >= 1){
					if(a > z){
						System.out.print("-");
					}else{
						System.out.print("A");
					}
				}
			}
			for(int b = x; b > 0;b--){
				if(z >= 1) {
					if(b > z){
						System.out.print("-");
					}else{
						System.out.print("A");
					}
				}
			}
			if(z >= 1){
				System.out.println();
			}
	}}
}

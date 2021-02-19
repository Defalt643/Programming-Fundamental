import java.util.Scanner;
public class HM04_LOOP_38 {

	public static void main(String[] args) {
		Scanner IO = new Scanner(System.in);
		int io = IO.nextInt();
		for(int i=io; i>1;i--){
			for(int o = 1; o <= io; o++){
				if(o >= i){
					System.out.print("*");
				}else {
					System.out.print("-");
				}
			}for(int p = io; p >0; p--){
				if(p < io){
					if(p >= i){
						System.out.print("*");
					} else {
						System.out.print("-");
					}
				}
			}System.out.println();
		}for(int x = io; x > 0;x--){
			for(int y = io; y > 0;y--){
				if(y <= x){
					System.out.print("*");
				}else{
					System.out.print("-");
				}
			}for(int o = 1; o <io ;o++){
				if(o < x){
					System.out.print("*");
				}else{
					System.out.print("-");
				}
			}System.out.println();
		}
	}
}

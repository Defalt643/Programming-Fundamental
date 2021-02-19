import java.util.Scanner;
public class HM02_IF_ELSE_07 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String x = kb.next();
		int y =0;
		char z = 0;
		int o=0;
		String a="";
		int q=0;
		char p1='A';char p2='A';int pi=0;
		for(int i = 1 ; i<5;i++) {
			o=i;
		}
		for(int i = 0; i<5;i++) {
			
			if(x.charAt(i)==x.charAt(o)) {
				y = y+1;
				z=x.charAt(i);
				
				a = y+"+"+z;
			}else if(x.charAt(i)!=x.charAt(o)) {
				System.out.print(1+""+x.charAt(i));
			}
				
			
		}System.out.print(y+""+z);
	}

}

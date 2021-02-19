import java.util.Scanner;
public class HM02_IF_ELSE_26 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double x = kb.nextDouble();
		
		if(x>0) {
			if(x%1==0 && x>0) {
				System.out.println("positive integer");
			}else if(x%1!=0 && x>0.99) {
				System.out.println("positive decimal");
			}
		}else if (x<0) {
			if(x%1==0 &&x<0) {
				System.out.println("negative integer");
			}else if(x<-0.99) {
				System.out.println("negative decimal");
			}
		}if (x==0) {
			System.out.println("zero integer");
		}else if( (x>-1)&&(x<0.99)) {
			System.out.println("zero decimal");
		}
	
	}

}

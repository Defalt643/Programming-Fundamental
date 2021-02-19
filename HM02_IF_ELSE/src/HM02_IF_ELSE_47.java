import java.util.Scanner;
public class HM02_IF_ELSE_47 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int weight = kb.nextInt();
		int age = kb.nextInt();
		int med = 0;
		
		if(age<2) {
			med=2*weight;
		}else if(age>1 && age<=5) {
			med=5*weight;
		}else if(age>5 && age<=12) {
			med = 8*weight;
		}else if(age>12 && age<=18) {
			med=12*weight;
		}else if(age>18) {
			med = 15*weight;
		}
		System.out.println(med);

	}

}

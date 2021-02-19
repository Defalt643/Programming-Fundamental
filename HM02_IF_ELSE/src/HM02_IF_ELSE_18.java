import java.util.Scanner;
public class HM02_IF_ELSE_18 {

	public static void main(String[] args) {
		Scanner kb =new Scanner(System.in);
		int x = kb.nextInt();
		if(x<1582) {
			if(x%4==0) {
				System.out.println(x+" is a leap year");
			}else {
				System.out.println(x+" is not a leap year");
			}
		}else {
			if(x%4==0) {
				if(x%100==0) {
					if(x%400==0) {
						System.out.println(x+" is a leap year");
					}else {
						System.out.println(x+" is not a leap year");
					}
				}
			}else {
				System.out.println(x+" is not a leap year");
			}
		}
	}

}

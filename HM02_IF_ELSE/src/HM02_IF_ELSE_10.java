import java.util.Scanner;
public class HM02_IF_ELSE_10 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x;
		x = kb.nextInt();
		if (x>-1) {
			if (x==0) {
				System.out.println("Error : Out of range");
			}
			if (x==1) {
				System.out.println("I");
			}
			if (x==2) {
				System.out.println("II");
			}
			if (x==3) {
				System.out.println("III");
			}
			if (x==4) {
				System.out.println("IV");
			}
			if (x==5) {
				System.out.println("V");
			}
			if (x==6) {
				System.out.println("VI");
			}
			if (x==7) {
				System.out.println("VII");
			}
			if (x==8) {
				System.out.println("VIII");
			}
			if (x==9) {
				System.out.println("IX");
			}
			if(x>9) {
				System.out.println("Error : Out of range");
			}
		}else {
			System.out.println("Error : Please input positive number");
		}

	}

}

import java.util.Scanner;
public class HM02_IF_ELSE_14 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x,y;
		x=kb.nextInt();
		y=kb.nextInt();
		
		if(x>0 && x<3) {
			System.out.println("Winter");
		}else {
			if(x==3) {
				if(y<21) {
					System.out.println("winter");
				}else{
					System.out.println("Spring");
				}
			}
		}
		if(x>3 && x<6) {
			System.out.println("Spring");
		}else {
			if(x==6) {
				if(y<21) {
					System.out.println("Spring");
				}else {
					System.out.println("Summer");
					}
				}
			}
		if(x>6 && x<9) {
			System.out.println("Summer");
		}else {
			if(x==9) {
				if(y<21) {
					System.out.println("Summer");
				}else {
					System.out.println("Fall");
				}
			}
		}
		if(x>9 && x<12) {
			System.out.println("Fall");
		}else {
			if(x==12) {
				if(y<21) {
					System.out.println("Fall");
				}else {
					System.out.println("Winter");
				}
			}
		}
	}
	

}

import java.util.Scanner;
public class HM04_LOOP_19 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x,total=0;
		do {
			x=kb.nextInt();
			if(x==5) {
				System.out.println("Bye Bye");
				break;
			}else if(x==1) {
				System.out.println("You choose Apple");
				total=total+100;
			}else if(x==2) {
				System.out.println("You choose Papaya");
				total=total+120;
			}else if(x==3) {
				System.out.println("You choose Banana");
				total=total+200;
			}else if(x==4) {
				System.out.println("You choose Orange");
				total=total+60;
			}
		}while(true);
		System.out.println("Total Calories: "+total);

	}

}

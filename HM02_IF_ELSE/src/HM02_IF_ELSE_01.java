import java.util.Scanner;
public class HM02_IF_ELSE_01 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int unit;
		double price,total,dis5,dis10,dis15,dis20;
		char member;
		unit = kb.nextInt();
		price =kb.nextDouble();
		member = kb.next().charAt(0);
		total = unit*price;
		dis5=(total/100)*5;
		dis10=(total/100)*10;
		dis15=(total/100)*15;
		dis20=(total/100)*20;
		if (member == 121) {
			if (total < 501) {
				System.out.printf("Total %.2f\n",total);
				System.out.printf("Discount %.2f\n",dis10);
				System.out.printf("Amount %.2f\n",(total-dis10));
			}
			if (total > 500 && total <1000) {
				System.out.printf("Total %.2f\n",total);
				System.out.printf("Discount %.2f\n",dis15);
				System.out.printf("Amount %.2f\n",(total-dis15));
			}
			if (total > 999) {
				System.out.printf("Total %.2f\n",total);
				System.out.printf("Discount %.2f\n",dis20);
				System.out.printf("Amount %.2f\n",(total-dis20));
			}
		}
		if (member == 110) {
			if (total < 501) {
				System.out.printf("Total %.2f\n",total);
				System.out.printf("Discount %.2f\n",dis5);
				System.out.printf("Amount %.2f\n",(total-dis5));
			}
			if (total > 500 && total <1000) {
				System.out.printf("Total %.2f\n",total);
				System.out.printf("Discount %.2f\n",dis10);
				System.out.printf("Amount %.2f\n",(total-dis10));
			}
			if (total > 999) {
				System.out.printf("Total %.2f\n",total);
				System.out.printf("Discount %.2f\n",dis15);
				System.out.printf("Amount %.2f\n",(total-dis15));
			}
		}
			
	}

}
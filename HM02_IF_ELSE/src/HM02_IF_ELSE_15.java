import java.util.Scanner;
public class HM02_IF_ELSE_15 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double income,tax;
		income= kb.nextDouble();
		tax=0;
		if(income>50000) {
			tax=tax+500;
			income=income-50000;
			if(income>25000) {
				tax=tax+500;
				income=income-25000;
				if(income>25000) {
					tax=tax+750;
					income=income-25000;
					if(income>150000) {
						tax=tax+6000;
						income=income-150000;
						if(income>250000) {
							tax=tax+12500;
							income=income-250000;
							if(income>0) {
								tax=tax+(income*0.06);
							}
						}else {
							tax=tax+(income*0.05);
						}
					}else {
						tax=tax+(income*0.04);
					}
				}else {
					tax=tax+(income*0.03);
				}
			}else {
				tax=tax+(income*0.02);
			}
		}else {
			tax=(income*0.01);
		}
		System.out.printf("%.2f",tax);

	}

}

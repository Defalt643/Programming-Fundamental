import java.util.Scanner;
public class HM02_IF_ELSE_06 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double height,weight,BMI;
		height = kb.nextDouble();
		weight = kb.nextDouble();
		height = height/100;
		height = height * height;
		BMI = weight/height;
		if(BMI <= 18.5) {
			System.out.printf("%.2f",BMI);
			System.out.println("\nUnderweight");
		}else {
			if(BMI > 18.5 && BMI < 23.5) {
				System.out.printf("%.2f",BMI);
				System.out.println("\nNormally");
			}
			if(BMI >= 23.5 && BMI < 28.5) {
				System.out.printf("%.2f",BMI);
				System.out.println("\nOverweight");
			}
			if(BMI >= 28.5 && BMI < 35) {
				System.out.printf("%.2f",BMI);
				System.out.println("\nFat level I");
			}
			if(BMI >= 35 && BMI < 40) {
				System.out.printf("%.2f",BMI);
				System.out.println("\nFat level II");
			}
			if(BMI > 40) {
				System.out.printf("%.2f",BMI);
				System.out.println("\nFattest");
			}
		}

	}

}

import java.util.Scanner;
public class MIDTERM_LAB_SAMPLE_LAST_YEAR_02 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		char x = kb.next().charAt(0);
		int y  = kb.nextInt();
		if(x=='n') {
			System.out.println("no ice cream");
		}else if (x=='y') {
			if(y<30) {
				System.out.println("Chocolate");
			}else {
				if(y>29 && y<36) {
					System.out.println("Strawberry");
				}else {
					if(y>35) {
						System.out.println("Vanilla");
					}
				}
			}
		}

	}

}

import java.util.Scanner;
public class HM02_IF_ELSE_04 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int y1,m1,d1,y2,m2,d2;
		y1 = kb.nextInt();
		m1 = kb.nextInt();
		d1 = kb.nextInt();
		y2 = kb.nextInt();
		m2 = kb.nextInt();
		d2 = kb.nextInt();
		
		if(y1 < y2) {
			System.out.println("1");
		}else {
			if(y1 > y2) {
				System.out.println("2");
			}
			if(y1==y2) {
				if(m1 < m2) {
					System.out.println("1");
				}
				if(m1 > m2) {
					System.out.println("2");
				}
				if(m1 == m2) {
					if(d1 < d2) {
						System.out.println("1");
					}
					if(d1 > d2) {
						System.out.println("2");
					}
					if(d1 == d2) {
						System.out.println("equal");
					}
				}
			}
		}

	}

}

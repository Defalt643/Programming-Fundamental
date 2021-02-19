import java.util.Scanner;
public class HM02_IF_ELSE_27 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double x1,y1,x2,y2,x3,y3,x4,y4,m1,m2;
		x1 = kb.nextDouble();
		y1 = kb.nextDouble();
		x2 = kb.nextDouble();
		y2 = kb.nextDouble();
		x3 = kb.nextDouble();
		y3 = kb.nextDouble();
		x4 = kb.nextDouble();
		y4 = kb.nextDouble();
		m1 = (y2-y1)/(x2-x1);
		m2 = (y4-y3)/(x4-x3);
		if (m1==m2){
			System.out.println("parallel");
		}else {
			if(m1!=m2) {
				if(m2==(-1/m1) || m1*m2 == -1) {
					System.out.println("perpendicular");
				}else {
				System.out.println("none");
			}
			
			}
		}
			
	}

}

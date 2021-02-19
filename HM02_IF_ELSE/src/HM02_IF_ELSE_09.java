import java.util.Scanner;
public class HM02_IF_ELSE_09 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double x,y,z,o,a;
		x=kb.nextDouble();
		y=kb.nextDouble();
		z=kb.nextDouble();
		o=kb.nextDouble();
		a=kb.nextDouble();
		
		if (x>y && x>z && x>o && x>a) {
			System.out.printf("Max %.2f\n",x);
		}else {
			if (y>x && y>z && y>o && y>a) {
				System.out.printf("Max %.2f\n",y);
			}else {
				if(z>x && z>y && z>o && z>a) {
					System.out.printf("Max %.2f\n",z);
				}else {
					if(o>x && o>y && o>z & o>a) {
						System.out.printf("Max %.2f\n",+o);
					}else {
						if(a>x && a>y && a>z & a>o) {
							System.out.printf("Max %.2f\n",+a);
						}
					}
				}
			}
		}
		if (y>x && z>x && o>x && a>x) {
			System.out.printf("Min %.2f\n",x);
		}else {
			if (x>y && z>y& o<y && a>y) {
				System.out.printf("Min %.2f\n",y);
			}else {
				if(x>z && y>z && o>z && a>z) {
					System.out.printf("Min %.2f\n",z);
				}else {
					if(x>o && y>o && z>o && a>o) {
						System.out.printf("Min %.2f\n",+o);
					}else {
						if(x>a && y>a && z>a && o>a) {
							System.out.printf("Min %.2f\n",+a);
						}
					}
				}
			}
		}			
		
	}

}

import java.util.Scanner;
public class HM02_IF_ELSE_08 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double x,y,z;
		x = kb.nextDouble();
		y = kb.nextDouble();
		z = kb.nextDouble();
		if(z==1) {
			System.out.printf("%.5f",x+y);
		}else {
			if(z==2) {
				System.out.printf("%.5f",x-y);
			}else {
				if(z==3) {
					System.out.printf("%.5f",x*y);
				}else {
					if(z==4) {
						System.out.printf("%.5f",x/y);
					}else {
						if(z==5) {
							System.out.printf("%.0f",x%y);
						}else {
							if(z==6) {
								System.out.printf("%.5f\n",(x*x));
								System.out.printf("%.5f",(y*y));
							}else {
								if(z==7) {
									System.out.printf("%.5f",(x+y)/2);
								}else {
									System.out.println("Error");
								}
							}
						}
					}
				}
			}
		} 
	}
}




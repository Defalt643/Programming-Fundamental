import java.util.Scanner;
public class HM02_IF_ELSE_48 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		int y = kb.nextInt();
		char z = kb.next().charAt(0);
		
		if(x>=7 && y<10 && z=='O') {
			System.out.println("Weight = "+x);
			System.out.println("Humidity = "+y);
			System.out.println("Color = "+z);
			System.out.println("Quality = Very Good");
		}else if(x<7 && x>4 && y>9 && y<16 && z == 'O') {
			System.out.println("Weight = "+x);
			System.out.println("Humidity = "+y);
			System.out.println("Color = "+z);
			System.out.println("Quality = Good");
		}else if(x>3 && y>15 && y<21 && z== 'Y') {
			System.out.println("Weight = "+x);
			System.out.println("Humidity = "+y);
			System.out.println("Color = "+z);
			System.out.println("Quality = OK");
		}else {
			System.out.println("Weight = "+x);
			System.out.println("Humidity = "+y);
			System.out.println("Color = "+z);
			System.out.println("Quality = Bad");
		}
	}

}

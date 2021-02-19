import java.util.Scanner;
public class HM02_IF_ELSE_31 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String x = kb.next();
		if(x.charAt(0)>64 && x.charAt(0)<91 && x.charAt(1)>64 && x.charAt(1)<91 && x.charAt(2)>64 && x.charAt(2)<91 && x.charAt(3)>64 && x.charAt(3)<91) {
			System.out.println("Capital Letter");
		}else if(x.charAt(0)>96 && x.charAt(0)<123 && x.charAt(1)>96 && x.charAt(1)<123 && x.charAt(2)>96 && x.charAt(2)<123 && x.charAt(3)>96 && x.charAt(3)<123) {
			System.out.println("Small Letter");
		}else {
			System.out.println("Mix");
		}
		
	}

}

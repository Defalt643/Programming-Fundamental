import java.util.Scanner;
public class HM02_IF_ELSE_35 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String x = kb.next();
		if(x.charAt(0) =='5'&& x.charAt(x.length()-1)=='5') {
			System.out.println("Very Lucky");
		}else if(x.charAt(0) =='9' && x.charAt(x.length()-1)=='9') {
			System.out.println("Very Lucky");
		}else if(x.charAt(0) !='9' && x.charAt(x.length()-1)!='9' && x.charAt(0) !='5' && x.charAt(x.length()-1)!='5') {
			if(x.charAt(0)==x.charAt(x.length()-1)) {
				System.out.println("Lucky");
			}
		}if(x.charAt(0)!=x.charAt(x.length()-1)) {
			System.out.println("Usual");
		}

	}

}

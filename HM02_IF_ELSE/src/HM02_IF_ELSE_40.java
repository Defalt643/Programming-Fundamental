import java.util.Scanner;
public class HM02_IF_ELSE_40 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String x = kb.next();
		String y = kb.next();
		String z = kb.next();
		if(x.length()==y.length() && x.length()==y.length() &&(x.charAt(0)==y.charAt(0)&&x.charAt(0)==z.charAt(0))) {
			System.out.println("YES");
		}else if((x.length()==y.length()&&x.length()!=z.length())||(x.length()==z.length() && x.length()!=y.length())) {
			System.out.println("Relatives");
		}else {
			System.out.println("NO");
		}
		
		

	}

}

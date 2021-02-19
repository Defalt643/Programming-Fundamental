import java.util.Scanner;
public class HM02_IF_ELSE_33 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String x = kb.next();
		int ten=0;
		if(x.length()==4) {
			char a = x.charAt(0);
			char b = x.charAt(1);
			char c = x.charAt(2);
			char d = x.charAt(3);
			int A = Integer.parseInt(String.valueOf(a));
			int B = Integer.parseInt(String.valueOf(b));
			int C = Integer.parseInt(String.valueOf(c));
			int D = Integer.parseInt(String.valueOf(d));
			ten = (A*(2*2*2))+(B*(2*2))+(C*2)+(D*1);

		}else if (x.length()==5) {
			char a = x.charAt(0);
			char b = x.charAt(1);
			char c = x.charAt(2);
			char d = x.charAt(3);
			char e = x.charAt(4);
			int A = Integer.parseInt(String.valueOf(a));
			int B = Integer.parseInt(String.valueOf(b));
			int C = Integer.parseInt(String.valueOf(c));
			int D = Integer.parseInt(String.valueOf(d));
			int E = Integer.parseInt(String.valueOf(e));
			ten = (A*(2*2*2*2))+(B*(2*2*2))+(C*(2*2))+(D*2)+(E*1);
		}
		System.out.println(ten);		

	}

}

import java.util.Scanner;
public class HM02_IF_ELSE_43 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();int y = kb.nextInt();
		
		String z = kb.next();
		
		char z1 = z.charAt(0);char z2 = z.charAt(1);
		char z3 = z.charAt(2);char z4 = z.charAt(3);
		
		int z1_I= Integer.parseInt(String.valueOf(z1));
		int z2_I= Integer.parseInt(String.valueOf(z2));
		int z3_I= Integer.parseInt(String.valueOf(z3));
		int z4_I= Integer.parseInt(String.valueOf(z4));
		
		int o =((x+y+(z1_I+z2_I+z3_I+z4_I)));
		int mod = o%2;
		
		if(mod==1) {
			System.out.println(o);
			System.out.println("Group B");
		}else if (mod==0) {
			System.out.println(o);
			System.out.println("Group A");
		}
	}

}

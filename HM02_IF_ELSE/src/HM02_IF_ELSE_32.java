import java.util.Scanner;
public class HM02_IF_ELSE_32 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String x = kb.next();
		if(x.length()>5) {
			System.out.println("Too Long");
		}else if (x.length()<3) {
			System.out.println("Too Short");
		}else if(x.length()==3) {
			if(x.charAt(0)=='1' && x.charAt(1)=='1' && x.charAt(2)=='1') {
				System.out.println("3");
			}else if (x.charAt(0)=='1' && x.charAt(1)=='1' && x.charAt(2)!='1') {
				System.out.println("2");
			}else if (x.charAt(0)=='1' && x.charAt(1)!='1' && x.charAt(2)=='1') {
				System.out.println("2");
			}else if (x.charAt(0)!='1' && x.charAt(1)=='1' && x.charAt(2)=='1') {
				System.out.println("2");
			}else if (x.charAt(0)!='1' && x.charAt(1)!='1' && x.charAt(2)=='1'){
				System.out.println("1");
			}else if (x.charAt(0)!='1' && x.charAt(1)=='1' && x.charAt(2)!='1') {
				System.out.println("1");
			}else if (x.charAt(0)=='1' && x.charAt(1)!='1' && x.charAt(2)!='1') {
				System.out.println("1");
			}else if (x.charAt(0)!='1' && x.charAt(1)!='1' && x.charAt(2)!='1') {
				System.out.println("0");
			}
		}else if (x.length()==4) {
			if(x.charAt(0)=='1' && x.charAt(1)=='1' && x.charAt(2)=='1' && x.charAt(3)=='1') {
				System.out.println("4");
			}else if (x.charAt(0)=='1' && x.charAt(1)=='1' && x.charAt(2)=='1' && x.charAt(3)!='1') {
				System.out.println("3");
			}else if (x.charAt(0)=='1' && x.charAt(1)=='1' && x.charAt(2)!='1' && x.charAt(3)=='1') {
				System.out.println("3");
			}else if (x.charAt(0)=='1' && x.charAt(1)!='1' && x.charAt(2)=='1' && x.charAt(3)=='1') {
				System.out.println("3");
			}else if (x.charAt(0)!='1' && x.charAt(1)=='1' && x.charAt(2)=='1' && x.charAt(3)=='1') {
				System.out.println("3");
			}else if (x.charAt(0)!='1' && x.charAt(1)!='1' && x.charAt(2)=='1' && x.charAt(3)=='1'){
				System.out.println("2");
			}else if (x.charAt(0)!='1' && x.charAt(1)=='1' && x.charAt(2)!='1' && x.charAt(3)=='1') {
				System.out.println("2");
			}else if (x.charAt(0)!='1' && x.charAt(1)=='1' && x.charAt(2)=='1' && x.charAt(3)!='1') {
				System.out.println("2");
			}else if (x.charAt(0)=='1' && x.charAt(1)!='1' && x.charAt(2)!='1' && x.charAt(3)=='1') {
				System.out.println("2");
			}else if (x.charAt(0)=='1' && x.charAt(1)!='1' && x.charAt(2)=='1' && x.charAt(3)!='1') {
				System.out.println("2");
			}else if (x.charAt(0)!='1' && x.charAt(1)=='1' && x.charAt(2)!='1' && x.charAt(3)!='1') {
				System.out.println("2");
			}else if (x.charAt(0)=='1' && x.charAt(1)!='1' && x.charAt(2)!='1' && x.charAt(3)!='1') {
				System.out.println("1");
			}else if (x.charAt(0)!='1' && x.charAt(1)=='1' && x.charAt(2)!='1' && x.charAt(3)!='1') {
				System.out.println("1");
			}else if (x.charAt(0)!='1' && x.charAt(1)!='1' && x.charAt(2)!='1' && x.charAt(3)=='1') {
				System.out.println("1");
			}else if (x.charAt(0)!='1' && x.charAt(1)!='1' && x.charAt(2)!='1' && x.charAt(3)!='1') {
				System.out.println("0");
			}
		}else if (x.length()==5) {
			if(x.charAt(0)=='1' && x.charAt(1)=='1' && x.charAt(2)=='1' && x.charAt(3)=='1' && x.charAt(4)=='1') {
				System.out.println("5");
			}else if (x.charAt(0)=='1' && x.charAt(1)=='1' && x.charAt(2)=='1' && x.charAt(3)=='1' && x.charAt(4)!='1') {
				System.out.println("4");
			}else if (x.charAt(0)=='1' && x.charAt(1)=='1' && x.charAt(2)=='1' && x.charAt(3)!='1' && x.charAt(4)=='1') {
				System.out.println("4");
			}else if (x.charAt(0)=='1' && x.charAt(1)=='1' && x.charAt(2)!='1' && x.charAt(3)=='1' && x.charAt(4)=='1') {
				System.out.println("4");
			}else if (x.charAt(0)=='1' && x.charAt(1)!='1' && x.charAt(2)=='1' && x.charAt(3)=='1' && x.charAt(4)=='1') {
				System.out.println("4");
			}else if (x.charAt(0)!='1' && x.charAt(1)=='1' && x.charAt(2)=='1' && x.charAt(3)=='1' && x.charAt(4)=='1') {
				System.out.println("4");
			}else if (x.charAt(0)=='1' && x.charAt(1)=='1' && x.charAt(2)=='1' && x.charAt(3)!='1' && x.charAt(4)!='1') {
				System.out.println("3");
			}else if (x.charAt(0)=='1' && x.charAt(1)=='1' && x.charAt(2)!='1' && x.charAt(3)=='1' && x.charAt(4)!='1') {
				System.out.println("3");
			}else if (x.charAt(0)=='1' && x.charAt(1)!='1' && x.charAt(2)=='1' && x.charAt(3)=='1' && x.charAt(4)!='1') {
				System.out.println("3");
			}else if (x.charAt(0)!='1' && x.charAt(1)=='1' && x.charAt(2)=='1' && x.charAt(3)=='1' && x.charAt(4)!='1') {
				System.out.println("3");
			}else if (x.charAt(0)!='1' && x.charAt(1)!='1' && x.charAt(2)=='1' && x.charAt(3)=='1' && x.charAt(4)=='1') {
				System.out.println("3");
			}else if (x.charAt(0)!='1' && x.charAt(1)=='1' && x.charAt(2)!='1' && x.charAt(3)=='1' && x.charAt(4)=='1') {
				System.out.println("3");
			}else if (x.charAt(0)!='1' && x.charAt(1)=='1' && x.charAt(2)=='1' && x.charAt(3)!='1' && x.charAt(4)=='1') {
				System.out.println("3");
			}else if (x.charAt(0)!='1' && x.charAt(1)!='1' && x.charAt(2)!='1' && x.charAt(3)=='1' && x.charAt(4)=='1') {
				System.out.println("2");
			}else if (x.charAt(0)!='1' && x.charAt(1)!='1' && x.charAt(2)=='1' && x.charAt(3)!='1' && x.charAt(4)=='1') {
				System.out.println("2");
			}else if (x.charAt(0)!='1' && x.charAt(1)!='1' && x.charAt(2)=='1' && x.charAt(3)=='1' && x.charAt(4)!='1') {
				System.out.println("2");
			}else if (x.charAt(0)=='1' && x.charAt(1)!='1' && x.charAt(2)!='1' && x.charAt(3)!='1' && x.charAt(4)=='1') {
				System.out.println("2");
			}else if (x.charAt(0)!='1' && x.charAt(1)!='1' && x.charAt(2)!='1' && x.charAt(3)!='1' && x.charAt(4)=='1') {
				System.out.println("1");
			}else if (x.charAt(0)!='1' && x.charAt(1)!='1' && x.charAt(2)!='1' && x.charAt(3)=='1' && x.charAt(4)!='1') {
				System.out.println("1");
			}else if (x.charAt(0)!='1' && x.charAt(1)!='1' && x.charAt(2)=='1' && x.charAt(3)!='1' && x.charAt(4)!='1') {
				System.out.println("1");
			}else if (x.charAt(0)!='1' && x.charAt(1)=='1' && x.charAt(2)!='1' && x.charAt(3)!='1' && x.charAt(4)!='1') {
				System.out.println("1");
			}else if (x.charAt(0)=='1' && x.charAt(1)!='1' && x.charAt(2)!='1' && x.charAt(3)!='1' && x.charAt(4)!='1') {
				System.out.println("1");
			}else if (x.charAt(0)=='1' && x.charAt(1)!='1' && x.charAt(2)!='1' && x.charAt(3)=='1' && x.charAt(4)=='1') {
				System.out.println("3");
			}else if (x.charAt(0)=='1' && x.charAt(1)=='1' && x.charAt(2)!='1' && x.charAt(3)!='1' && x.charAt(4)=='1') {
				System.out.println("3");
			}else if (x.charAt(0)!='1' && x.charAt(1)!='1' && x.charAt(2)!='1' && x.charAt(3)!='1' && x.charAt(4)!='1') {
				System.out.println("0");
			}
		}

	}

}

import java.util.Scanner;
public class LAB14_RECURSIVE_01 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x =kb.nextInt();
		System.out.println(fib(x));
	}public static int fib(int n) {
		if(n==0 || n==1) {
			return 1;
		}else {
			return fib(n-1)+fib(n-2);
		}
	}

}

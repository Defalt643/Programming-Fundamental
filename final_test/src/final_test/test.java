package final_test;

public class test {
	static int a =0; 
	public static void func1(int x) {
			a += 15;
			System.out.print(a);

		}public static int func2(int x) {
			return func3(x, -1, a);
		}public static int func3(int x, int m, int n) {

			int a = 12;

			if(x <= a)
				return n + m;	
			return x + n;

		}public static void main(String[] args) {

			int a = 7;

			System.out.print(func2(a));

			func1(a);

		}
}

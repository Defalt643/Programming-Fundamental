
public class QUIZ_LAB14_RECURSIVE_TEST {

	public static void main(String[] args) {
		abc(10);

	}public static void abc(int n) {
		if (n>=1){
			abc(n-2);
			System.out.print(n);
			}
			}

}

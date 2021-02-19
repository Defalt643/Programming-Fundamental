import java.util.Scanner;
public class HM01_10 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String name,surname,age;
		name = kb.next();
		surname = kb.next();
		age = kb.next();
		if (name.length() > 5 && surname.length() > 5) {
			System.out.print(name.charAt(0));
			System.out.print(name.charAt(1));
			System.out.print(surname.charAt(5));
			System.out.print(age.charAt(1));
		}else {
			System.out.print(name.charAt(0));
			System.out.print(age);
			System.out.print(surname.charAt(4));
		}

	}

}

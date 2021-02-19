import java.util.Scanner;

public class HM04_LOOP_06 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int fatboy = 0;
		int skiny = 0;
		int weight;
		int round = 0;
		do {
			weight = kb.nextInt();
			if (weight == -1) {
				break;
			}
			if (weight > 60) {
				fatboy = fatboy + 1;
			} else {
				skiny = skiny + 1;
			}
			round = round + 1;
		} while (weight != -1 && round != 10);
		System.out.println(fatboy);
		System.out.println(skiny);

	}

}

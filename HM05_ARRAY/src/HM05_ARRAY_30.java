import java.util.Scanner;

public class HM05_ARRAY_30 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		char x[][] = new char[3][3];
		int cx=0,co=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				x[i][j] = kb.next().charAt(0);
				if(x[i][j]=='X') {
					cx=cx+1;
				}else {
					co=co+1;
				}
			}
		}System.out.println(co);
		System.out.println(cx);
		if (x[0][0] == 'O' && x[0][1] == 'O' && x[0][2] == 'O') {
			System.out.println("O WON");
		} else if (x[1][0] == 'O' && x[1][1] == 'O' && x[1][2] == 'O') {
			System.out.println("O WON");
		} else if (x[2][0] == 'O' && x[2][1] == 'O' && x[2][2] == 'O') {
			System.out.println("O WON");
		}else if (x[0][0] == 'O' && x[0][1] == 'O' && x[0][2] == 'O') {
			System.out.println("O WON");
		} else if (x[1][0] == 'O' && x[1][1] =='O'&& x[1][2] == 'O') {
			System.out.println("O WON");
		} else if (x[2][0] == 'O' && x[2][1] == 'O' && x[2][2] == 'O') {
			System.out.println("O WON");
		}else if (x[0][0] == 'O' && x[1][1] == 'O' && x[0][2] == 'O') {
			System.out.println("O WON");
		} else if (x[2][0] == 'O' && x[1][1] == 'O' && x[0][2] == 'O') {
			System.out.println("O WON");
		}
		if (x[0][0] == 'X' && x[0][1] == 'X' && x[0][2] == 'X') {
			System.out.println("X WON");
		} else if (x[1][0] == 'X' && x[1][1] == 'X' && x[1][2] == 'X') {
			System.out.println("X WON");
		} else if (x[2][0] == 'X' && x[2][1] == 'X' && x[2][2] == 'X') {
			System.out.println("X WON");
		}else if (x[0][0] == 'X' && x[0][1] == 'X' && x[0][2] == 'X') {
			System.out.println("X WON");
		} else if (x[1][0] == 'X' && x[1][1] =='X'&& x[1][2] == 'X') {
			System.out.println("X WON");
		} else if (x[2][0] == 'X' && x[2][1] == 'X' && x[2][2] == 'X') {
			System.out.println("X WON");
		}else if (x[0][0] == 'X' && x[1][1] == 'X' && x[0][2] == 'X') {
			System.out.println("X WON");
		} else if (x[2][0] == 'X' && x[1][1] == 'X' && x[0][2] == 'X') {
			System.out.println("X WON");
		}else {
			System.out.println("DRAW");
		}
	}
}

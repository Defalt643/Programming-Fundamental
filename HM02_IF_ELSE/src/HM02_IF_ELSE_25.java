import java.util.Scanner;
public class HM02_IF_ELSE_25 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String x = kb.next();
		String z = null,type = null;
		if(x.length()==2) {
			char y = x.charAt(0);
			if(y>48 && y<58) {
				z=Character.toString(y);
			}
			else if(y=='A') {
				z="Ace";
			}else if(y=='J') {
				z="Jack";
			}else if(y=='Q') {
				z="Queen";
			}else if(y=='K') {
				z="King";
			}
			char a=x.charAt(1);
			if(a=='D') {
				type = "Diamonds";
			}else if(a=='H') {
				type="Hearts";
			}else if(a=='S') {
				type="Spades";
			}else if(a=='C') {
				type="Clubs";
			}
			System.out.println(z+" of "+type);
				
		}if(x.length()==3) {
			char a=x.charAt(2);
			if(a=='D') {
				type = "Diamonds";
			}else if(a=='H') {
				type="Hearts";
			}else if(a=='S') {
				type="Spades";
			}else if(a=='C') {
				type="Clubs";
			}
			System.out.println(10+" of "+type);
		}

	}

}

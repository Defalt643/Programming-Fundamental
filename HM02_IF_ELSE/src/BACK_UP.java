import java.util.Scanner;
public class BACK_UP {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String x = kb.next();
		char y = x.charAt(0);
		String type = null,font = null ;
		char z = 0;
		
		if(x.length()>1) {
			if(z=='D') {
				type = "Diamonds";
			}else if(z=='H') {
				type="Hearts";
			}else if(z=='S') {
				type="Spades";
			}else if(z=='C') {
				type="Clubs";
			}if(y>49 && y<58) {
				font=Character.toString(y);
			}
			else if(y=='A') {
				font = "Ace";
			}else if(y=='J') {
				font = "Jack";
			}else if(y=='Q') {
				font="Queen";
			}else if(y=='K') {
				font = "King";
			}
		}else if (x.length()>2) {
			
		}
		System.out.println(font+" of "+type);

	}

}

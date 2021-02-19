import java.util.Scanner;
public class HM02_IF_ELSE_45 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String x = kb.next();
		int R=0;
		int G=0;
		int P=0;
		
		for(int i =0;i<5;i++) {
			if(x.charAt(i)=='R') {
				R=R+1;
			}if(x.charAt(i)=='G') {
				G=G+1;
			}if(x.charAt(i)=='P') {
				P=P+1;
			}
		}
		System.out.println(R+"R"+G+"G"+P+"P");

	}

}

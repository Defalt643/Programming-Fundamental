import java.util.Scanner;
public class HM05_ARRAY_04 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt(),y[]= new int[x],z[]=new int[x];
		for(int i =0,o=x-1;i<x;i++,o--) {
			y[i]=kb.nextInt();
			z[o]=y[i];
		}for(int i =0;i<x;i++) {
			System.out.println("i["+i+"] = "+y[i]+" j["+i+"] = "+z[i]);
		}
	}

}

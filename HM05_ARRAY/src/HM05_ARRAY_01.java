import java.util.Scanner;
public class HM05_ARRAY_01 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt(),y[]=new int[x],lower=0,higher=0;
		double avg =0;
		for(int i=0;i<x;i++) {
			y[i]=kb.nextInt();
			avg=avg+y[i];
		}avg=avg/x;
		for(int i=0;i<x;i++) {
			if(y[i]>avg) {
				higher=higher+1;
			}else {
				lower=lower+1;
			}
		}
		System.out.println("Average : "+avg);
		System.out.println("Lower : "+lower);
		System.out.println("Higher : "+higher);

	}

}

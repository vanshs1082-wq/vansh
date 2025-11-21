package javapractice;

import java.util.Scanner;

public class mean {
	public static void main(String[] abc) {
		Scanner sc = new Scanner(System.in);
		
		int[] team=new int[11];
		for(int i=0;i<11;i++) {
			int a =sc.nextInt();
			team[i]=a;
			
		}
		int g=0;
		for(int i=0;i<11;i++) {
			g+=team[i];
		
		}
		int mean=g/11;
		System.out.print(mean);
	}	

}

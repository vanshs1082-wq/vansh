package javapractice;

import java.util.Scanner;

public class multi {
	public static void main(String[] abc) {
		Scanner sc = new Scanner(System.in);
		int[] b=new int[10];
		int a=sc.nextInt();
		for(int i=0;i<10;i++) {
			b[i]=(a*i)+2;
		}
		for(int i=0;i<10;i++) {
			System.out.println(b[i]);
		}
		
	}

}

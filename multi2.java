package javapractice;

import java.util.Scanner;

public class multi2 {
	public static void main(String[] abc) {
		Scanner sc = new Scanner(System.in);
		int[] b=new int[4];
		int a=sc.nextInt();
		for(int i=0;i<4;i++) {
			b[i]=(a*(i+6));
		}
		int c=6;
		for(int i=0;i<4;i++) {
			
			
			System.out.println(a+"*"+c+"="+b[i]);
			c++;
		}
	}	

}

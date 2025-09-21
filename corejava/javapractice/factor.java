package javapractice;

import java.util.Scanner;

public class factor {
	public static void main(String[] abc) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=0;
		
		int[] fac=new int[a-1];
		for(int i=a;i>1;i--) {
			if(a%i==0) {
				fac[b]=i;
				b++;
			}
			
			
		}
		for(int i=0;i<10;i++) {
			System.out.println(fac[i]);
			
			
		}

	}

}

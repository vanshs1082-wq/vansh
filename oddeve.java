package javapractice;

import java.util.Scanner;

public class oddeve {
	public static void main(String[]abc) {
		Scanner sc = new Scanner(System.in);
		
		int[] num=new int[5];
		for(int i=0;i<5;i++) {
			int a=sc.nextInt();
			num[i]=a;
		}
		for(int i=0;i<5;i++) {
			if(num[i]<0) {
				System.out.println(num[i]+"is negative");
			}
			if(num[i]>0) {
				System.out.println(num[i]+"is positive");
				if(num[i]%2==0) {
					System.out.println(num[i]+"is even");
				}else {
					System.out.println(num[i]+"is odd");
				}
				
				
				
			}
			if(num[i]==0) {
				System.out.println(num[i]+"is zero");
			}
			sc.close();
			
		}
		
	}   
	

}

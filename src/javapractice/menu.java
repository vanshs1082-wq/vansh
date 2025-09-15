package javapractice;

import java.util.Scanner;

public class menu {
	public static void main(String[] abc) {
		Scanner sc=new Scanner(System.in);
		int b=0;
		do {
			System.out.println("press 1");
			System.out.println("press 2");
			System.out.println("press 3");
			System.out.println("press 4");
			System.out.println("press 5 for exit");
			int a =sc.nextInt();
			if(a==5) {
				break;
			}
					
		}while(b<1);
	}

}

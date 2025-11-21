package javapractice;

import java.util.Scanner;

public class guess {
	public static void main(String[] abc) {
		int a=9;
		int c=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.print("guess the number");
			int b =sc.nextInt();
			if (b==9) {
				System.out.print("you gussed it right");
				break;
			}
			
			
		}while(c<1);
	}

}

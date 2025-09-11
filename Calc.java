package javapractice;

import java.util.Scanner;

public class Calc {
	public static void main(String[] abc) {
		Scanner sc=new Scanner(System.in);
		System.out.println("for addition press 1");
		System.out.println("for subtration press 2");
		System.out.println("for multiply press 3");
		System.out.println("for divide press 4");
		int z = sc.nextInt();
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		switch(z) {
		case 1:
			System.out.print(a+b);
			break;
		case 2:
			System.out.print(a-b);
			break;
		case 3:
			System.out.print(a*b);
			break;
		case 4:
			System.out.print(a/b);
			break;
		default:
			System.out.print("enter correct choice");
			
		}
		
		
	}
	

}

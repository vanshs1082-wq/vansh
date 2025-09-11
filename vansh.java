/*package javapractice;

import java.util.Scanner;

public class vansh {
	public static void main(String[] abc) {
		Scanner sc= new Scanner(System.in);
		int  a= sc.nextInt();
		if(a%2==0 && a % 3==0) {
			System.out.println("True");
			
		}else {
			System.out.println("False");
		}
		

		
	}

}*/
package javapractice;

import java.util.Scanner;

public class vansh {
	public static void main(String[] abc) {
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		switch (a) {
		case 1:
			System.out.print("Jan");
			break;
		case 2:
			System.out.print("feb");
			break;
		case 3:
			System.out.print("Mar");
			break;
		case 4:
			System.out.print("apr");
			break;
		case 5:
			System.out.print("may");
			break;
		case 6:
			System.out.print("Jun");
			break;
		case 7:
			System.out.print("Jul");
			break;
		case 8:
			System.out.print("Aug");
			break;
		case 9:
			System.out.print("sep");
			break;
		case 10:
			System.out.print("oct");
			break;
		case 11:
			System.out.print("nov");
			break;
		case 12:
			System.out.print("dec");
			break;
		default:
			System.out.print("choose the correct option");
		
		}
	}

}

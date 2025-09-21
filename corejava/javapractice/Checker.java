package javapractice;
import java.util.Scanner;

public class Checker {
	public static void main(String[]abc) {
		Scanner sc=new Scanner(System.in);
		int b=0;
		
		for(int i=0;;) {
			System.out.print("enter a number");
			int a=sc.nextInt();
			if(a<0) {
				break;
			}else {
				b+=a;
			}
			
		}
		System.out.print(b); 
	}

}

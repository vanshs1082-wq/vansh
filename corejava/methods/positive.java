package methods;

import java.util.Scanner;

public class positive {
	public static void handshake(int n) {
        if(n>0) {
        	System.out.println("positive");	
        }
        if(n==0) {
        	System.out.println("zero");	
        }
        if(n<0) {
        	System.out.println("negative");	
        }
    }
	public static void main(String[] abc) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int n=sc.nextInt();
		
		handshake.handshake(n);
		
	}	

}

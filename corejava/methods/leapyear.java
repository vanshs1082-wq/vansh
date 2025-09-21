package methods;

import java.util.Scanner;

public class leapyear {
	public static int Leapyear(int y) {
        if (y%4==0&& y/100 !=0) {
        	return 1;
        }
        
    }
	public static void main(String[] abc) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year");
		int N=sc.nextInt();
		
		leapyear.Leapyear(N);
	}	

}

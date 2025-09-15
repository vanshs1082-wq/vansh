package methods;
import java.lang.Math;
import java.util.Scanner;

public class simpleintrest {
	public static double intrest(int principal, int rate ,int time) {
        int si = (principal*rate*time)/100;
        return si;
    }
	public static void main(String[] abc) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principal");
		int principal=sc.nextInt();
		System.out.println("enter rate");
		int rate=sc.nextInt();
		System.out.println("enter time");
		int time=sc.nextInt();
		double x=simpleintrest.intrest(principal, rate, time);
		System.out.println(x);
		
	}
	

}

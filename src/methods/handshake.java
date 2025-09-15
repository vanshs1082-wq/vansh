package methods;
import java.lang.Math;
import java.util.Scanner;

public class handshake {
	public static int handshake(int n) {
        int ph =  (n * (n - 1)) / 2 ;
        return ph;
    }
	public static void main(String[] abc) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of student");
		int N=sc.nextInt();
		
		int x=handshake.handshake(N);
		System.out.print("number of possible handshake =");
		System.out.println(x);
		

}
}
package javapractice;
import java.util.Scanner;
public class max0 {
	public static void main(String[] abc) {
		int b=0;
		Scanner sc=new Scanner(System.in);
		int[] number=new int[10];
		for(int i=0;i<5;i++) {
			int a=sc.nextInt();
			number[i]=a;
			if(a==0) {
				break;
			}
		}
		for(int i=0;i<5;i++) {
			System.out.println(number[i]);
			b+=number[i];
		}
		System.out.print(b);
	}

}

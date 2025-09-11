package javapractice;
import java.util.Scanner;

public class ageverify {
	public static void main(String[] abc) {
		Scanner sc = new Scanner(System.in);
		
		int[] age=new int[10];
		for(int i=0;i<10;i++) {
			int a =sc.nextInt();
			age[i]=a;
			
		}
		for(int i=0;i<10;i++) {
			if(age[i]<0) {
				System.out.println(age[i]+"invalid age");
			}
			if(age[i]<18) {
				System.out.println("the student of age "+age[i]+"cannot vote");
			}
			if(age[i]>=18) {
				System.out.println("the student of age "+age[i]+"can vote");
			}
			sc.close();
		}
	}
	

}

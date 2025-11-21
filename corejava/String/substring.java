package String;

import java.util.Scanner;

public class substring {
	public static void main(String[] abc) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b;
		for(int i=2;i<8;i++) {
			b.trim().concat(a.charAt(i));
		}
		System.out.println(a.substring(2,7)==b);
	}

}

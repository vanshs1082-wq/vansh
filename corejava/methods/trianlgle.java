package methods;

import java.util.Scanner;

public class trianlgle {
	public static double perimeter(int a,int b ,int c) {
		int d=a+b+c;
		
		
        double rounds = 5/d;
        return rounds;
    }
	public static  main(String[] abc) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first side in km");
		int a=sc.nextInt();
		System.out.println("enter second side in km ");
		int b=sc.nextInt();
		System.out.println("enter third side in km");
		int c=sc.nextInt();
		double x=trianlgle.perimeter(a,b,c);
		System.out.println(x);
		
		

}

}

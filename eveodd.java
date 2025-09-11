package javapractice;

import java.util.Scanner;

public class eveodd {
	public static void main(String[] abc){
		Scanner sc = new Scanner(System.in);
		int dim[]=new int[4];
		int Dim[][]=new int[2][2];
		for(int i =0;i<2;i++) {
			for(int j=0;j<2;j++) {
				int a =sc.nextInt();
				Dim[i][j]=a;
			}
		}
		int k=0;
		for(int i =0;i<2;i++) {
			for(int j=0;j<2;j++) {
				dim[k]=Dim[i][j];
				k++;
			}
		}
		for(int i =0;i<4;i++) {
			
				System.out.println(dim[i]);
			
		}
		
		
	}

}

package a07_반복.퀴즈;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.println("횟수: ");
		n=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1;j++) {
				System.out.print(" ");
			}			
			for(int j=0;j<i+1;j++) {				
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}

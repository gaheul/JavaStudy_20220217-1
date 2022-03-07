package a08_함수;

import java.util.Scanner;

public class MethodEx3 {
	
	public static void printStar(int num) {
		if(num<1) {
			System.out.println("1개 이상입력하셔야합니다.");
		}else {
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-i-1;j++) {
				System.out.print(" ");
			}			
			for(int j=0;j<(i*2)+1;j++) {				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	}
	public static void main(String[] args) {
		/*
		 * printStar(입력받은 별의 개수)
		 * 1보다 작음 음수가 들어왔을 때, 별의 개수는 1개 이상을 입력하셔야합니다.
		 */

		Scanner sc=new Scanner(System.in);
		System.out.print("별의 갯수를 입력하세요: ");
		int number = sc.nextInt();
		printStar(number);
		
		
	}

}

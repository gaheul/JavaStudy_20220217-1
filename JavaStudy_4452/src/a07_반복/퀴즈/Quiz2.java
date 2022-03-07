package a07_반복.퀴즈;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		//자연수 n이 주어졌ㅇㄹ 때 1부터 n까지
		Scanner sc=new Scanner(System.in);
		int num=0;
		System.out.println("반복 횟수입력: ");
		 num=sc.nextInt();
		
		for(int i =0; i<num; i++) {
			System.out.println(num-i);
		}
			
		
		

	}

}

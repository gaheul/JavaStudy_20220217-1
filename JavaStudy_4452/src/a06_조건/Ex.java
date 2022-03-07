package a06_조건;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 윤년구분하기
		 * 1.year변수를 만들어서 년돌르 입력받는다.
		 * 2.연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
		 * 3.윤년은 4의 배수이면서, 100의 배수가 아닐때 또는 400의 배수일 때이다.
		 */
		
		Scanner sc= new Scanner(System.in);
		int x =0;
		
		
		System.out.print("연도를 입력하세요: ");
		x = sc.nextInt();
		
		if(x>0 && x <4001) {
			if(x%4==0 && (x % 100 !=0 || x %400==0)) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}else {
			System.out.println("잘못된수입니다.");
		}

	}

}

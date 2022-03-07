package a06_조건;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		/*
		 * score =85
		 *  90 - 100 a
		 *  80 - 89 b
		 *  70 - 79 c
		 *  60 - 69 d
		 *  0 - 59 f
		 */
		Scanner sc = new Scanner(System.in);
		int score=0;
		System.out.print("점수를 입력하세요: ");
		score = sc.nextInt();
		
		switch(score /10 ) {
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6: 
				System.out.println("D");
				break;
			default:
				System.out.println("F");
		}

	}

}

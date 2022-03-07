package a05_입력;

import java.util.Scanner;

public class ScoreEx {

	public static void main(String[] args) {
		/**
		 * int score 입력 
		 * score 마이너스 점수 이거나 100점을 넘으면 x 출력
		 * 90점이상 a 80 이상 b 70이상 c 60이상 d 그외 f
		 * 
		 * 성적을 입력해 주세요: 85
		 * 학생의 평점은 B등급입니다.
		 */
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String grade= null;
		
		System.out.print("성적을 입력해 주세요: ");
		score = sc.nextInt();
		grade = score > -1 && score <101 ?  "A":"X";
		
		System.out.println("학생의 평점은 "+ grade + "입니다.");
		
		
			
				
		
		

	}

}

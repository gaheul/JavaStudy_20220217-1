package a03_연산자;

public class Operation04 {
	
	/*
	 * 논리연산자(boolean)-> true,false
	 * AND ->&& -> 곱
	 * OR -> || -> 합
	 * NOT ->!! -> 부정
	 * 
	 * true(1).false(0)
	 * - true && true => true
	 *   true && false => false
	 * &&: 모든조건이 일치할때만 true
	 * 
	 * - true || true => true
	 *   true || false => true
	 *   false || false => false
	 * || :모든 조건이 거짓일 때만 false
	 *     하나라도 true면 true
	 * 
	 * - !(true || false) => false
	 *   !true || false => false 
	 */

	public static void main(String[] args) {
		int score = -1;
		boolean result;
		//score가 음수도 안되고 100 초과도 안된다 false
		result = !(score < 0 || score >100)  ;
		System.out.println("결과: " + result);
		
		char grade ='A';
		//grade 소문자여도 되고 대문자도 가능-> A,a,B,b,C,c 외는 false
		result = grade == 'a' || grade =='b' || grade == 'c' || grade == 'A' || grade =='B' || grade =='C' ;
		System.out.println("결과2: "+result);
		

	}

}

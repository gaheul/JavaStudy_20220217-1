package a10_배열;

/**
 * 
 * 배열(Array)
 * 연관된 데이터를 하나의 변수에 그룹핑해서 관리하는 기법
 * 1학년 1반(1번~30번) -> 그룹을 묶어주는 것
 * 자료형[] 배열변수명 = new 자료형[배열공간의 개수];(갯수 1부터)
 * int[] numbers =  new int[5];
 * numbers =>그룹된 주소
 * new int[5] => 5개의 공간
 * 
 * User[] users = new User[3];
 * 
 * 
 *
 */

public class ArrayTest {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		numbers[1] = 100;
		
		
		for(int i=0;i<10 ; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println( );
		
		/*
		 * String 배열 10개의 공간을 생성
		 * 가나다라마바사아자차
		 * 
		 */
		String[] nums= new String[10];
		
		nums[0] ="가";
		nums[1]="나";
		nums[2]="나";
		nums[3]="다";
		nums[4]="라";
		nums[5]="마";
		nums[6]="바";
		nums[7]="아";
		nums[8]="자";
		nums[9]="차";
		
		//kor.length => 배열의 크기가 변할 때 마다 반복횟수 바꿔줄필요없음
		//i<nums.length+1; => 배열의 크기에 넘었기때문에 오류남 
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		int[] numArray = {1, 5, 4, 3, 2, 6, 9};//선언과 초기화 동시에/값이 적을때(테스트할때)
		int[] numArray2 = new int[100];
		
		for(int i=0; i<numArray.length;i++) {
			System.out.println(numArray[i]);
		}
	}

}

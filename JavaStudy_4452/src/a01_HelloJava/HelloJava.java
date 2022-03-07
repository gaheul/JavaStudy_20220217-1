package a01_HelloJava;

/**
 * 
 * 여러 줄 주석(클래스 또는 메소드를 설명하는 주석)
 *
 */

/*
 * 
 * 여러 줄 주석(여러줄 메모용)
 */

// 한줄 주석

//주석의 단축키 : ctrl + /

public class HelloJava {
	
	/**
	 * main
	 * 프로그램 시작지점
	 * 
	 */
	public static void main(String[] args) {
		//''- > 문자 :'ㅁ'
		//""-> 문자열 : "ㅁㅁㅁㅁㅁ"
		//프로그램 실행(Run) :ctrl +f11
		System.out.println("hello, java");
		System.out.println("김가흘\n");
		
		
		/*
		 * 이름 : 김가흘
		 * 연락처 : 
		 * 주소 :
		 * 
		 */
		System.out.print("이름: ");
		System.out.println("김가흘");
		System.out.print("연락처: ");
		System.out.println("010-2208-4452");
		System.out.print("주소: ");
		System.out.println("양산 어곡동");
	}

}

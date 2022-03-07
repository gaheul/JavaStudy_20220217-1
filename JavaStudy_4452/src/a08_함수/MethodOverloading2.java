package a08_함수;

import java.util.Scanner;

/**
 * 
 * 오버로딩의 개념.
 * 
 * 메소드의 이름을 재사용할 수  있다.
 * 
 * 요리사에게 재료 3개를 주면 3개를 가지고 요리를 해아하고 1개를 주면 하나의 재료로 요리를 해아한다.
 * 특징1. 매개변수의 개수에 따라 메소드를 정의 할 수 있다.
 * 
 * 요리사에게 재료 2개를 주고 도구 1개를 전달한다. 
 * 특징2. 매개변수의 자료형이 다르면 매개변수의 개수가 같아도 정의 할 수 있다.
 * 
 * 
 *
 */
/*
 * 계산기
 * 입력 
 * 첫번째 수 입력
 * 
 * 사칙연산(+ ,-, *, / )
 * 
 * 두번째 수 입력
 * 
 * 결과를 출력
 * 
 * 정수와 실수 모두 계산가능
 * 
 * calc()
 */

public class MethodOverloading2 {
		
//	public static String calc(String num1, String num2, char operator) {
//		String result =null;
//		if(operator=='+') {
//			result = Double.toString(Double.parseDouble(num1)+ Double.parseDouble(num2));
//		}else if(operator=='-') {
//			result = Double.toString(Double.parseDouble(num1)- Double.parseDouble(num2));
//		}else if(operator=='*') {
//			result = Double.toString(Double.parseDouble(num1)* Double.parseDouble(num2));
//		}else if(operator=='/') {
//			result = Double.toString(Double.parseDouble(num1)/ Double.parseDouble(num2));
//		}else {
//			result="계산 할 수 없는 연산자 입니다.";
//		}
//		return result;
//	}
	
	public static String calc(double num1, double num2, char operator) {
		String result =null;
		if(operator=='+') {
			result = Double.toString(num1+num2);
		}else if(operator=='-') {
			result = Double.toString(num1- num2);
		}else if(operator=='*') {
			result = Double.toString(num1* num2);
		}else if(operator=='/') {
			result = Double.toString(num1/ num2);
		}else {
			result="계산 할 수 없는 연산자 입니다.";
		}
		return result;
	}
	
	public static String calc(int num1, int num2, char operator) {
		String result =null;
		if(operator=='+') {
			result = Integer.toString(num1+num2);
		}else if(operator=='-') {
			result = Integer.toString(num1- num2);
		}else if(operator=='*') {
			result = Integer.toString(num1* num2);
		}else if(operator=='/') {
			result = Integer.toString(num1/ num2);
		}else {
			result="계산 할 수 없는 연산자 입니다.";
		}
		return result;
	}
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String x=null;
		String y=null;
		char operator=' ';
		System.out.print("첫번 째 수 입력: ");
		x=sc.next();
		System.out.print("연산할 기호 선택: ");
		operator=sc.next().charAt(0);
		System.out.print("두번 째 수 입력: ");
		y=sc.next();
		
//		System.out.println("결과1: "+calc(x,y,operator));
//		System.out.println("결과2: "+calc(x,y,operator));
		System.out.println("결과2: "+calc(Double.parseDouble(x),Double.parseDouble(y),operator));
		System.out.println("결과2: "+calc(Integer.parseInt(x),Integer.parseInt(y),operator));
		
		
	}

}

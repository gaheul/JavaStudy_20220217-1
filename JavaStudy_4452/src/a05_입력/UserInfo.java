package a05_입력;

import java.util.Scanner;
/*
 *  import 단축키 : ctrl +shift + o
 *  scanner만 입력 후 ctrl+ sp (자동완성) -차음작성할때 
 */


public class UserInfo {

	public static void main(String[] args) {
		/**
		 * username(아이디)
		 * password(비밀번호)
		 * year(년도) -정수
		 * month(월)
		 * day(일)
		 * name(이름)
		 * address(주소) 부산 동래구 사직동
		 */
		Scanner scanner = new Scanner(System.in);	
//		String username = null;
		
		String username = scanner.next();
		String password = scanner.next();		
		int year = scanner.nextInt();		
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		String name = scanner.next();
		scanner.nextLine();
		String address = scanner.nextLine();	
		
		System.out.println("아이디: " + username);
		System.out.println("비밀번호: " + password);	
		System.out.println("생년월일: "+ year + "/" + month + "/" +day);
		System.out.println("이름: "+name);
		System.out.println("주소: "+address); 
		

	}

}

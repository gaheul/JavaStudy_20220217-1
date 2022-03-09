package a13_인터페이스2.controller;

import java.util.Scanner;

import a13_인터페이스2.model.User;
import a13_인터페이스2.service.UserService;
import a13_인터페이스2.view.Index;
import a13_인터페이스2.view.IndexImpl;
import a13_인터페이스2.view.Input;
import a13_인터페이스2.view.SelectGetUser;
import a13_인터페이스2.view.SelectGetUserImpl;

public class PageController {
	//변수
	private final Input input;
	private final UserService userService;
	
	public PageController(Input input, UserService userService) {//
		
		this.input = input; 
		this.userService = userService;
	}
	
	public void index() {
		Index index = new IndexImpl();
		Scanner scanner = new Scanner(System.in);//반복적으로 쓰기때문에 생성
		while(true) {//메인루프
		index.show(); //메뉴화면 출력
		char select = input.typedSelect(scanner); //select값을 받기위해서 (재사용) / input을 implement하는 곳에 tpedse 메소드를 생성함
		//메뉴조건
		if(select =='1') { //회원가입
			User user =input.typedUser(scanner); //만들어진 주소 담김 /user객체 생성 및 객체 데이터 삽입
			userService.addUser(user); // user추가/배열(userData ->userservice)에 저장
		}else if(select =='2') {//회원조회
			selectGetUser();
		}else if(select =='q') {
			System.out.println("프로그램 종료.");
			break;
		}else {
			System.out.println("해당 명령은 실행할 수 없습니다.");
			}
		System.out.println();
		}
	}
	
	public void selectGetUser() {
		SelectGetUser selectGetUser = new SelectGetUserImpl();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			selectGetUser.show();
			char select = input.typedSelect(scanner);
			
			if(select == '1') {
				User[] users =userService.getUsers();
				
				for(int i=0;i<users.length; i++) { //user배열에 들어있는 user객체 정보를 전부 출력
					if(users[i]==null) { //user배열의 해당 인덱스에 user객체가 없으면 user객체.showUser()메소드를 호출 할 수 없기 때문에 continue로 넘김
						continue; //배열이 비어있으면 넘어가라
					}
					users[i].showUser(); //배열에 들어있으면 메소드 실행 /해당배열에 user객체가 존재하기 때문에 user정보를 출력
				}
			}else if(select =='2') {
				String uername = input.typedUsername(scanner);
				User user = userService.getUser(uername);
				user.showUser();
			}else if(select == 'b') {
				System.out.println("메인 메뉴로 이동");
				break;
			}else {
				System.out.println("해당 명령은 실행할 수 없습니다.");
			}
			System.out.println();
			
		}
	}
}

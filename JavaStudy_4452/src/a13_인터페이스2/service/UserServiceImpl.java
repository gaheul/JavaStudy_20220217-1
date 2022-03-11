package a13_인터페이스2.service;

import java.util.Scanner;

import a13_인터페이스2.data.UserData;
import a13_인터페이스2.model.User;

public class UserServiceImpl implements UserService { //데이터와 컨트롤러의  소통함을 위함,로직(계산식)처리
	private final UserData userData ;
	private final Scanner scanner;
	
	public UserServiceImpl() { //ipl생성되는 시점에 배열에 주입해주겟다
		scanner = new Scanner(System.in);
		System.out.println("관리할 회원의 수를 입력해주세요: ");
		 User[] users = new User[scanner.nextInt()];
		// 회원을 저장할 배열의 크기를 (입력받고) 크기를 지정하고 생성된 배열(공간)을 UserData객체의 users배열변수에 set하는 것 (set에 주소를 전달)
		//예를들어10개짜리 user객체를 담을 수있는 만든다 -> 만든 배열 전체의 주소를 .setUsers한테 넘겨준다
		scanner.nextLine(); //위의 nextInt()후에 버퍼에 저장된 엔터를 날려주기위함
		this.userData = UserData.getInstance(users);
		
	}
	
	@Override
	public void addUser(User user) {//입력받은 주소를전달
		User[] users=userData.getUsers(); //user배열 주소 가져옴
		for(int i=0; i<users.length; i++) { //user 배열에서 빈공간이 있으면 입력한 user객체를 배열에 저장-반복문
			if(users[i] == null) {
				users[i] = user;
				break; //없으면 빈공간에 똑같은 정보가 계속들어감 
			}
		}
		
	}

	@Override
	public User[] getUsers() {
		
		return userData.getUsers(); //userdata에 저장되어있는 배열
	}

	@Override
	public User getUser(String username) {
		User[] users = userData.getUsers();
		User user= null;
		for(int i=0;i<users.length;i++) {
			if(users[i] != null && users[i].getUsername().equals(username)) {
				user = users[i];
				break;
			}
		}
		return user;
	}
	
}

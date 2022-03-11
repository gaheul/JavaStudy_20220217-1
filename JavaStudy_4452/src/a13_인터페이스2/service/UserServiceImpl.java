package a13_인터페이스2.service;

import a13_인터페이스2.data.UserData;
import a13_인터페이스2.model.User;

public class UserServiceImpl implements UserService { //데이터와 컨트롤러의  소통함을 위함,로직(계산식)처리
	private final UserData userData ;
	
	public UserServiceImpl(UserData userData) { //ipl생성되는 시점에 배열에 주입해주겟다
		this.userData = userData;
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

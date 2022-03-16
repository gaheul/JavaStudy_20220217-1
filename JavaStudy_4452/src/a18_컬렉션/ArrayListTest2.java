package a18_컬렉션;

import java.util.ArrayList;

import a13_인터페이스2.model.User;

public class ArrayListTest2 {

	public static void main(String[] args) {
		/*
		 * ArrayList(userList) User
		 * 
		 * User객체 3개 생성해서 userList에 add
		 */
		
		ArrayList<User> userList = new ArrayList<User>();
		
		User user1= User.builder()
						.username("a")
						.password("1234")
						.build();
		
		User user2= User.builder()
						.username("b")
						.password("1234")
						.build();
		
		User user3= User.builder()
						.username("c")
						.password("1234")
						.build();
		
		User user4= User.builder()
						.username("d")
						.password("1234")
						.build();
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		
		System.out.println("[회원 아이디 리스트]");
		for(User user: userList) {
			System.out.println(user.getUsername());
		}
		System.out.println();
				
		System.out.println("[회원 비밀번호 리스트]");
		for(User user: userList) {
			System.out.println(user.getPassword());
		}
		System.out.println();
		
		System.out.println("[회원 아이디 리스트]");
		for(int i=0; i<userList.size();i++) {
			System.out.println(userList.get(i).getUsername());
		}
		System.out.println("[회원 비밀번호 리스트]");
		for(int i=0; i<userList.size();i++) {
			System.out.println(userList.get(i).getPassword());
		}
		
		userList.set(0, User.builder().username("ttt").password("1111").build()); //수정
		userList.add(0, User.builder().username("yyy").password("2222").build()); //삽입
		System.out.println(userList);

	}

}

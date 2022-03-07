package a09_클래스_정보은닉;

public class UserTest {

	public static void main(String[] args) {
		User user = new User("aaaa","1324","김가흘","aaa@gmail.com"); //기본생성자 생성해야 사용가능
//		user.setUsername("aaaa");
//		user.setPassword("1324");
//		user.setName("김가흘");
//		user.setEmail("aaa@gmail.com");
		
		/*
		 * 아이디 : aaaa
		 * 비밀번호 : 1234
		 * 이름 : 
		 * 이메일 : aaa@gmail.com
		 */
		
//		String username = user.getUsername(); //메모리 낭비
//		System.out.println("아이디: "+username);
//		String password = user.getPassword(); 
//		System.out.println("비밀번호: "+password);
		
		System.out.println("아이디: "+user.getUsername());
		System.out.println("비밀번호: "+user.getPassword());		
		System.out.println("이름: "+user.getName()); 
		System.out.println("이메일: "+user.getEmail());
		
		

	}

}

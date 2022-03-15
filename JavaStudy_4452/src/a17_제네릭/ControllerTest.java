package a17_제네릭;

import a13_인터페이스2.model.User;
import a17_제네릭.User.CompanyUser;
import a17_제네릭.User.PersonalUser;

public class ControllerTest {
	
	public CMRespDto<? extends User> getProfile(String username){ // <extends User>user를 상속받은 객체만 제네릭으로 리턴가능
		PersonalUser personalUser = new PersonalUser("jkjkjk","1234","가흘","jkjk@gmail.com","a20220001");
		CompanyUser companyUser = new CompanyUser("apple","1111","애플","apple@gmail.com","220-81-47821");
		
		if(username.equals(personalUser.getUsername())) {
			return new CMRespDto<PersonalUser>(1,"개인회원프로필",personalUser); //생성하는시점
			
		}else if(username.equals(companyUser.getUsername())) {
			return new CMRespDto<CompanyUser>(1,"기업회원프로필",companyUser);
		}else {
			return new CMRespDto<User>(-1,"프로필로드 실패",new User()); 
		}
	}	
	
	public CMRespDto<?> login(String username, String password) {
		User userEntity = User.builder() //생성할때 매개변수로 원하는 것만 넣을수 있음(순서 노상관)
							  .username("rkgdf")
							  .password("12354")
							  .name("가흘")
							  .email("dfdfdf@dfdf")
							  .build();
		
	//	User user = new User("sdff","1234",null,null); //매개변수 다 넣어야함
		
		if(userEntity.getUsername().equals(username)) {
			if(userEntity.getPassword().equals(password)) {
				System.out.println("로그인 성공");			
				return new CMRespDto<User>(1,"로그인 성공",userEntity); //생성할 때의 제네릭 타입만 제대로 주면 됨
			}else {
				System.out.println("로그인 실패(비밀번호가 틀렸습니다.");
				CMRespDto<?> cmRespDto = new CMRespDto<String>(-1,"비밀번호가 틀렸습니다.",password);
				return cmRespDto;
			}
		}else {
			System.out.println("로그인 실패(아이디가 틀렸습니다.");
			CMRespDto<?> cmRespDto = new CMRespDto<String>(-1,"아이디가 틀렸습니다.",username);
			return cmRespDto;
		}
		
	}

	public static void main(String[] args) {
		ControllerTest test = new ControllerTest();
		System.out.println(test.login("rkgmf1", "1234"));
		System.out.println(test.getProfile("jkjkjk"));

	}

}

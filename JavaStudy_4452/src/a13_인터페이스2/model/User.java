package a13_인터페이스2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	private String username;
	private String password;
	private String name;
	private String email;
	
	
	
//	public void showUser() {
//		System.out.println("User[username=" +username+ ", password=" + password+ ", name=" + name+ ", email= " + email+"]");
//	} toString 오버라이드함
	
	
	
}

package a10_배열;

public class UserArrayTest {

	public static void main(String[] args) {
		User[] users = new User[5];
		
		users[0] = new User("gaheul","1234");
		users[1] = new User("gaheul","12345");
		users[2] = new User("gaheul","123456");
		
		for(int i=0; i<users.length; i++) {
//			if(users[i] != null) {
//			users[i].showInfo();
//			}
			if(users[i] == null) {
				continue; //null 이면 건너뛰어라
			}
			users[i].showInfo();
		}
		
		System.out.println( );
		
		int[] numbers = new int[5];
		
		for(int i =0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		

	}

}

package a14_최상위클래스;

public class StringTest {

	public static void main(String[] args) {
		Computer computer1 = new Computer();
		Computer computer2 = computer1;
		Computer computer3 = new Computer();
		
		
		System.out.println(computer1== computer2);
		System.out.println(computer1== computer3);
		System.out.println(computer1.equals(computer2)); //주소값비교 
		
		Integer num1 = 10;
		int num2 = 10;
		
		System.out.println(num1 + num2);
		
		String name = "김가흘";
		String name2 = "김가흘";
		String name3 = new String("김가흘"); //string 도 클래스 ->생성가능
		
		System.out.println(name3);
		
		System.out.println(name == name2); 
		System.out.println(name == name3);
		System.out.println(name.equals(name3)); //문자열 값 비교

	}

}

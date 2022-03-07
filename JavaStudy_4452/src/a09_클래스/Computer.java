package a09_클래스;

public class Computer {
	String model; //변수
	
	//생성자의 return값은 무조건 주소값이다.
	public Computer() {
		System.out.println("컴퓨터 객체를 생성합니다.");                         
	} //생성자
	
	public void printInfo() {
		System.out.println("컴퓨터 모델: "+ model);
	} //메소드
}

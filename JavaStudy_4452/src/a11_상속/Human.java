package a11_상속;

/*
 * 오버라이드
 * :부모로부터 상속,인터페이스의 구현을 했을 때 상위클래스 또는 인터페이스가 가지고 있는 메소드를 재정의하는 것(덮어쓰기)
 * 
 * 
 */

public class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 움직입니다.");
	}
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

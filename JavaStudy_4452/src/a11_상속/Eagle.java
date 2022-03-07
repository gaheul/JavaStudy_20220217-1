package a11_상속;

public class Eagle extends Animal{
	@Override //어노테이션('재정의했다'라는 표기)
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
		//super.move();
		// super ->부모의 주소
	}
//	public void move() {
//		System.out.println("독수리가 하늘을 납니다.");
//	}
	
	public void flying() {
		System.out.println("독수리가 날개를 펴고 하늘로 날아 올라갑니다.");
	}
}

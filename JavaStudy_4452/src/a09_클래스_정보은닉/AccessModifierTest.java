package a09_클래스_정보은닉;

import a09_클래스.Student;

/**
 * 접근지정자(AccessModifier)
 * 
 * default : 클래스가 위치하고 있는 패키지 내부(같은 패키지)
 * protected : 클래스가 위치하고 있는 패키지 내부(같은 패키지) =default / 상속관계를 가지면 다른 패키지에 있어도 접근을 허용
 * public : 모든 위치에서 접근 가능
 * private : 본인 클래스 내부에서만 접근이 가능
 * 
 *
 */

public class AccessModifierTest {

	public static void main(String[] args) {
		AccessModifier accessModifier = new AccessModifier();
		
//		accessModifier.name ="김가흘" ;
//		accessModifier.age =00 ;
		
		
		Student student = new Student();
		

	}

}

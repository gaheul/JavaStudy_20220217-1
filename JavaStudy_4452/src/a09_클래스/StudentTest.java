package a09_클래스;

/**
 * Student(클래스)
 * 속성(변수)
 * schoolName
 * studentYear
 * studentGroup
 * studentnumber
 * studentName
 * studentAddress
 * studentphone
 * graduationFlag(boolean)
 * 
 * 기능(메소드)
 * showStudentInfo()
 * 학교명: 부산고등학교
 * 학년: 3학년
 * 반: 2
 * 번호: 10
 * 이름: 
 * 주소:
 * 연락처: 
 * 졸업구분 : true(졸업), false(재학중);
 * 
 * incrementYear()
 * 학년 +1
 * 학년 3학년을 넘어서면 graduationFlag = true;
 * 
 */

public class StudentTest {

	public static void main(String[] args) {
		Student c1= new Student("부산고등학교",1,2,10,"김가흘","양산","010-2208-4452",false);
		c1.schoolName="부산고등학교";
		c1.studentYear=1;
		c1.studentGroup=2;
		c1.studentNumber=10;
		c1.studentName="김가흘";
		c1.studentAddress="양산";
		c1.studentPhone="010-2208-4452";
		c1.graduationFlag= false ;
		
		c1.showStudentInfo();
		c1.incrementYear();
		c1.incrementYear();
		c1.incrementYear();
		
		Student s2= new Student("경남고등학교","김가흘");
	

	}

}

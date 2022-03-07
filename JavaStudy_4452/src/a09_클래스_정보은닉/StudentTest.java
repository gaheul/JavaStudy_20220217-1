package a09_클래스_정보은닉;

/*
 * Student 클래스 정의 
 * 속성
 * SchoolName
 * studentCode(학번) 20220000
 * studentYear
 * studentName
 * 
 * 생성자(기본,전체)
 * getter,setter
 * 
 * 메소드 showStudentInfo
 * 학교명 : 코리아아이티아카데미
 * 학번: 20220001
 * 학년 : 1
 * 이름: 
 * 
 * 학교명: 코리아아이티아카데미
 * 학번: 20220002
 * 학년:3
 * 이름:
 */

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student("코리아아이티아카데미",20220001,1,"김가흘");				
			
		Student student2 = new Student("코리아아이티아카데미",20220002,3,"김가");
		
		student.showStudentInfo();
		student2.showStudentInfo();
		
				

		
		
		
		
		

	}

}

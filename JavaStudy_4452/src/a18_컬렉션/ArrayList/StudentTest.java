package a18_컬렉션.ArrayList;

import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {
		StudentService service = new StudentService(new ArrayList<Student>());
		
		service.showStudentAll();
		
		service.addStudent("김가흘1", "aaa@dfd", "양산");
		service.addStudent("김가흘2", "bbb@dfd", "양산");
		service.addStudent("김가흘3", "ccc@dfd", "양산");
		service.showStudentAll();
		
		service.updateStudentByName("김가흘1",null,null);
		service.showStudentByName("김가흘1");
		
		service.deleteStudentByName("김가흘1");
		service.showStudentAll();
	}

}

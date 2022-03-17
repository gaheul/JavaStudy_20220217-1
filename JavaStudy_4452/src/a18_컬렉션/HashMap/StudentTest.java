package a18_컬렉션.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentTest {

	public static void main(String[] args) {
		StudentService service = new StudentService(new HashMap<String,Student>());
		
		service.showStudentAll();
		
		service.addStudent("김가흘1", "aaa@dfd", "양산");
		service.addStudent("김가흘2", "bbb@dfd", "양산");
		service.addStudent("김가흘3", "ccc@dfd", "양산");
		service.showStudentAll();
		
		service.updateStudentByName("김가흘1","aaa@dfd","부산");
		service.showStudentByName("김가흘1");
		
		service.deleteStudentByName("김가흘1");
		service.showStudentAll();
	}

}

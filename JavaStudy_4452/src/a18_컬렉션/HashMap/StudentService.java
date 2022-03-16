package a18_컬렉션.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class StudentService {
	private final HashMap<String,Student> studentMap;
	
	public StudentService(HashMap<String,Student> studentMap) {
		this.studentMap = studentMap;
	}
	
	//학생 추가
	public void addStudent(String name,String email,String address) {
		Student student = new Student(name,email,address);
		studentMap.put(name, student);
		System.out.println(name+"학생 정보가 추가되었습니다.");
	}
	
	//학생 전체 정보 조회
	public void showStudentAll() {	
		if(studentMap.isEmpty()) {
			System.out.println("등록된 학생이 없습니다.");
			System.out.println();
		}else {
			Set<String> set = studentMap.keySet();
			Iterator<String> ir= set.iterator();
			while(ir.hasNext()) {
				System.out.println(studentMap.get(ir.next()));				
		}
		
		}				
	}
	
	
	//학생 이름으로 정보 조회
	public void showStudentByName(String name) {
		if(studentMap.containsKey(name)) {
			System.out.println(studentMap.get(name));
		}else {
			System.out.println(name+"의 학생 정보가 존재하지 않습니다.");
		}
	}
	
	private boolean isEmpty(String str) {
		boolean result = false;
		if(str == null || str.equals("")) {
			result= true;
		}
		return result;
	}
	
	//학생 정보 수정
	public void updateStudentByName(String name,String email, String address) {
		if(studentMap.replace(name, null, null)) {
			System.out.println(studentMap.get(name));
		}else {
			System.out.println(name+"의 학생 정보가 존재하지 않습니다.");
		}
	}
	
	//학생 정보 삭제
	public void deleteStudentByName(String name) {
		
		
	}
}

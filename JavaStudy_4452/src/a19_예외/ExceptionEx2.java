package a19_예외;

import java.io.IOException;
import java.util.ArrayList;

import a18_컬렉션.ArrayList.Student;

public class ExceptionEx2 {
	
	public void array() throws IOException, IndexOutOfBoundsException,NullPointerException{//thrwos->일어날수있는일을 예상해서 붙여야함
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student()); //0번 인덱스
		students.add(new Student()); //1
		students.add(new Student()); //2
		students.add(new Student()); //3
		students.add(new Student()); //4
		students.add(new Student()); //5
		students.add(new Student()); //6
		students.add(new Student()); //7
		
		for(int i=0; i<students.size()+1;i++) {
			Student student = students.get(i);
			student.setName("김가흘");
			System.out.println(student.getName());
		}
		System.out.println("트라이문 끝까지 실행?");
	}
		

	public static void main(String[] args) {
		ExceptionEx2 ex2 = new ExceptionEx2();
		try {
			ex2.array();
		} catch (IndexOutOfBoundsException | NullPointerException | IOException e) {//세개중에 하나의 예외가 발생하면 한번에 처리하겠다
			System.out.println("예외발생");
			e.printStackTrace();
		}
	
//		try {
//			
//		}catch(NullPointerException e) { 
//			System.out.println("주소를 참조할 수 없습니다.");
//		}catch(IndexOutOfBoundsException e) {
//			System.out.println("참조할 수 있는 인덱스의 크기를 초과하였습니다.");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			System.out.println("예외가 발생하든 하지 않든 무조건 실행");
//		}
	
//----------------------------------------------------------------------	
//		ArrayList<Student> students = new ArrayList<Student>();
//		students.add(new Student()); //0번 인덱스
//		students.add(new Student()); //1
//		students.add(new Student()); //2
//		students.add(new Student()); //3
//		students.add(new Student()); //4
//		students.add(new Student()); //5
//		students.add(new Student()); //6
//		students.add(new Student()); //7
		
//		try {
//			for(Student student : students) {
//				student.setName("김가흘");
//				System.out.println(student.getName());
//			}
//			System.out.println("트라이문 끝까지 실행?");
//		}catch(NullPointerException e) { 
//			System.out.println("주소를 참조할 수 없습니다.");
//		}
//		System.out.println("프로그램종료");
		
//		try {
//			for(int i=0; i<students.size()+1;i++) {
//				Student student = students.get(i);
//				student.setName("김가흘");
//				System.out.println(student.getName());
//			}
//			System.out.println("트라이문 끝까지 실행?");
//		}catch(NullPointerException e) { 
//			System.out.println("주소를 참조할 수 없습니다.");
//		}catch(IndexOutOfBoundsException e) {
//			System.out.println("참조할 수 있는 인덱스의 크기를 초과하였습니다.");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			System.out.println("예외가 발생하든 하지 않든 무조건 실행");
//		}
		
		System.out.println("프로그램종료");

	}

}

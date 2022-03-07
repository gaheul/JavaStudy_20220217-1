package a09_클래스;

public class Car {
	String company;
	String model;
	int oil;
	
	private void oilError() { //private : 외부에서 쓰면안되기 때문
		System.out.println("기름이 부족하여 차량의 이동이  불가능합니다.");
		}
		
	public void go() {
		if(oil <1) {
			oilError();
		}else {
		oil--;
		System.out.println("기름이 1감소하였습니다.");
		}
	}
	
	
	
	public void oiling() {
		oil++;
		System.out.println("기름이 1증가하였습니다.");
	}
	
	public void showCarInfo() {
		System.out.println(company+"에서 제조한 "+model+"차량의 정보입니다.");
		System.out.println("현재 기름은"+oil+"리터입니다.");
		
	}
	
	

}

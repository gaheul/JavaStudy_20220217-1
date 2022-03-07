package a09_클래스2;

public class PhoneTest {
	/*
	 * addPhone(int type,String model,int color);
	 * 리턴은 객체(주소값)
	 * 
	 */
	public static Phone addPhone(int type,String model,int color) {
		Phone phone = new Phone(type,model,color);	//생성자 -생성과 동시에 값변동 x
//		phone.setPhoneType(type); -값변동 가능
//		phone.setPhoneModel(model);
//		phone.setPhoneColor(color);
		
		return phone;
	}
	
	public static void main(String[] args) {
		// 객체생성1
		Phone p1=addPhone(1, "dfd", 2);//메소드호출
		p1.powerOff();
		p1.powerOn();
		p1.showPhoneInfo();
		
	}

}

package a16_스태틱;

import java.time.LocalDate;

public class KIA {
	private static KIA instance; //하나의 인스턴스 생성
	private String companyName;
	private int serialNumber;
	
	private KIA() {
		companyName = getClass().getSimpleName();
		serialNumber = LocalDate.now().getYear() * 10000;
	}
	
	public static KIA getInstance() { //접근할 수 있는 전역적인 접근점
		if(instance == null) {
			instance = new KIA();		
		}		
		return instance;
	}
	
	public Car createCar(String model) {
		return new Car(++serialNumber, companyName, model);
	}
}

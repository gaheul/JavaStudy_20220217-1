package a09_클래스_정보은닉;

public class Car {
	private String model;
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		//model = model; //사용할 수 없음
		this.model = model;
	}
}

package a09_클래스2;

public class Tumbler extends Product {
	private String cap; //버튼식, 오픈식

	public Tumbler(int productCode, String productName, String cap) {
		super(productCode,productName); //부모의 정보도 필요하기 때문에 생성시점에 부모에 생성
		this.cap = cap;
	}
	
	public void tumblerTest() {
		System.out.println("텀블러만 가지고 있는 메소드");
	}
	
	@Override
	public void showProduct() {
		// TODO Auto-generated method stub
		super.showProduct();
		System.out.println("뚜껑타입: "+cap);
		System.out.println();
	}
	
	
	
//	public void showTumblerInfo() {
//		super.showProduct(); //showProduct() 도 가능
//		System.out.println("뚜껑타입: "+cap);
	}
	
	


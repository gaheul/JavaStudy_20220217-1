package a09_클래스2;

/**
 * 
 * 클래스(틀)
 * 
 * 속성(변수)
 * 기능(메소드)
 * 
 * 자동차(틀) -객체
 * 속성(변수)
 * 차종
 * 차량색상
 * 
 * 기능(메소드)
 * 앞으로간다
 * 뒤로간다
 * 기름을 넣는다
 * 창문을 연다
 * 미디어(소리)를 켠다, 끈다
 * 
 * 프로그래밍 적인 사고
 * 클래스를 정의(참조 자료형을 정의)
 * 정의된 클래스를 생성
 * 생성시에 힙 메모리 영역에 주소를 할당
 * 
 *
 */

public class ProductTest {
	public static void test2(Product pp) {
		pp.showProduct();
	}
	
	public static Product test() {
		Product product = new Product();
		product.showProduct();
		product.setProductCode(20220307);
		product.setProductName("모니터1");
		return product;
	}

	public static void main(String[] args) {
		Product p = test();
		test2(p); //똑같은 주소
		System.out.println();
		
//		Tumbler tumbler = new Tumbler(2000, "스타벅스 텀블러", "오픈식");
//		MugCup cup = new MugCup(3000, "스타벅스 머그컵", true);
		
		Product tumbler = new Tumbler(2000, "스타벅스 텀블러", "오픈식");
		Product cup = new MugCup(3000, "스타벅스 머그컵", true);
		
		tumbler.showProduct();
		cup.showProduct();
		
		Product[] products = new Product[2];
		products[0] =tumbler;
		products[1] =cup;
		
		for(int i=0; i<products.length; i++) {
			products[i].showProduct();
			if(products[i] instanceof Tumbler) {
				Tumbler tumbler2 = (Tumbler)products[i];
				tumbler2.tumblerTest();
			}else {
				MugCup cup2 = (MugCup)products[i];
				cup2.mugcupTest();
			}
		}

	}

}

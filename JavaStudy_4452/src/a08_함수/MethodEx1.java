package a08_함수;

public class MethodEx1 {
	
	public static int outputNumber() {
		return 10;
	}
	
	public static void showName() {
		String name="김가흘";
		System.out.println("이름: "+name);
	}
	
	public static int outputNumber2(int number) {
//		int number=100;
		return number;
	}
	
	public static int outputNumber3(int number) {
		if(number % 2==0) {
			return 0;
		}else {
			return 1;
		}
	}
	
	public static void showName2(String name) {
		if(name ==null) {
			return;
		}
		System.out.println(name); //실행안됨->void는 return을 만나면서 sysout 실행x
	}

	public static void main(String[] args) {
		int number = outputNumber();
		System.out.println(number);
		showName();
		showName2(null);
		int number2=outputNumber2(100);
		System.out.println(number2);

	}

}

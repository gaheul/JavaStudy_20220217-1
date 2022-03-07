package a08_함수;

public class FunctionEx {
	
	public static int calc(int x, int y, int z) {
		int result=x+y;
		int result2= result*z;
		return result2;
	}

	public static void main(String[] args) {
		
		int r= calc(10,20,30); //호출한다
		System.out.println(calc(10,20,30));
		System.out.println(calc(11,20,30));
		
		int result=10+20;
		int result2= result*30;
		System.out.println(result2);
		
		result= 11+20;
		result2= result * 30;
		System.out.println(result2);

	}

}

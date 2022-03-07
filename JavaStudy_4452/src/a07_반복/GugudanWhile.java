package a07_반복;

public class GugudanWhile {

	public static void main(String[] args) {
		int dan =2;
		int num =0;
		while(num<9) {
//			num++;
			System.out.println(dan+"x" +(++num)+ "="+dan*num);
		}
		
		/*
		 * 2(dan) x 1(num)=2
		 * 2x 2=4
		 * 2x3=6
		 * ...
		 * 2x9=18
		 */

	}

}

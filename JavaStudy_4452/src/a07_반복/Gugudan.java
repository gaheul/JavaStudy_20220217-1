package a07_반복;

public class Gugudan {

	public static void main(String[] args) {
		
		for(int i=0; i<8; i++) {
			int dan= i+2;
			System.out.println((i+2)+"단");
			
			for(int j=0; j<9;) {
				System.out.println(dan+"x"+ (++j)+"="+dan*j);
			}
			System.out.println();
		}
		
			

	}

}

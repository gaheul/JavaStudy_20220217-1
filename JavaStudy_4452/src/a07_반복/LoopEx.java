package a07_반복;

public class LoopEx {

	public static void main(String[] args) {
		int num =0;
		int result=0;
		
		while(num<100) {
			result+=(++num);
//			result=result + (++num);
		}
		System.out.println(result);
		
		int i =0;
		while (i <100) {
			System.out.println(i); // 0
			i++; //없으면 i가 계속 0 ->무한반복 /0
			System.out.println(i); //1 ->다시 조건식
		}
		
		System.out.println("   ");
		
		for(int j=0; j<100; j++) {
			System.out.println(j);
		}
		for (; ;) {}
			
		
		
		
//		int z =0;
//		for( ; z<100; ) {
//			System.out.println(z);
//			z++;
//		}
	}

}

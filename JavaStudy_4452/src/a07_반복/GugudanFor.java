package a07_반복;

public class GugudanFor {

	public static void main(String[] args) {
		int dan =2;
		
		for(int i=0; i<9;i++) {
			System.out.println(dan+"x"+(i+1)+"="+(dan*(i+1)));
		}
		for(int i=0; i<9;) {
			System.out.println(dan+"x"+ ++i +"="+(dan*i));

	}
		for(int i=0,j=0; i<9;i++,j++) {
			System.out.println(dan+"x"+ ++i +"="+(dan*i));
		}
	}
}

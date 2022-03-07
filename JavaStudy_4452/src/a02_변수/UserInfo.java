package a02_변수;

public class UserInfo {

	public static void main(String[] args) {
		/*
		 * 학번: 20220001 ->studentCode(정수)
		 * 이름:          -> name1, name2, name3(문자)
		 * 학년: 1        ->studentYear(정수)
		 * 성적: 85.5     ->score(실수)
		 * 평점: B        ->grade(문자)
		 * 성별: 남성(true), 여성(false) ->gender(boolean) 
		 */
		
		int studentCode = 20220001;
		System.out.println("학번: " + studentCode);

		
	    char name1='김';
	    char name2='가';
	    char name3='흘';
	    System.out.print("이름: ");
	    System.out.println(""+ name1 + name2 + name3);
//	    System.out.print(name2);
//	    System.out.println(name3);
	    
	    int studentYear = 1;
	    System.out.print("학년: ");
	    System.out.println(studentYear);
	    
	    double score=85.5;
	    System.out.print("성적: ");
	    System.out.println(score);
	    
	    char grade='B';
	    System.out.print("펑점: ");
	    System.out.println(grade);
	    
	    boolean gender=false;
	    System.out.print("성별: ");
	    System.out.println(gender);
	   

	}

}

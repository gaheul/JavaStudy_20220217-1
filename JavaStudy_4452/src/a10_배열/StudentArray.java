package a10_배열;

public class StudentArray {

	public static void main(String[] args) {
		Student[] students = new Student[5];
		students[0] = new Student("김준일",1);
		students[1] = new Student("김준이",4);
		students[2] = new Student("김준삼",3);
		students[3] = new Student("김준사",1);
		students[4] = new Student("김준오",2);
		
		/*
		 * 1학년 :2명
		 * 2학년 :1명
		 * 3학년: 1명
		 * 4학년: 1명
		 */
//		int yearCount1=0;
//		int yearCount2=0;
//		int yearCount3=0;
//		int yearCount4=0;
		int[] yearCounts = new int[4];
		
		for(int i=0; i<students.length;i++) {						
			int studentYear = students[i].getStudentYear();
			if(studentYear==1) {
				//yearCount1++;
				yearCounts[0]++;				
			}else if(studentYear==2) {
				//yearCount2++;
				yearCounts[1]++;
			}else if(studentYear==3) {
				//yearCount3++;
				yearCounts[2]++;
			}else if(studentYear==4) {
				//yearCount4++;
				yearCounts[3]++;
			}
		}
		
		 
			
	
//		
//		System.out.println("1학년: "+yearCount1+"명");
//		System.out.println("1학년: "+yearCount2+"명");
//		System.out.println("1학년: "+yearCount3+"명");
//		System.out.println("1학년: "+yearCount4+"명");
		
		System.out.println("1학년: "+yearCounts[0]+"명");
		System.out.println("1학년: "+yearCounts[1]+"명");
		System.out.println("1학년: "+yearCounts[2]+"명");
		System.out.println("1학년: "+yearCounts[3]+"명");
		

	}

}

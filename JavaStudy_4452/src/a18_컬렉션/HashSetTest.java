package a18_컬렉션;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> strSet = new HashSet<String>();
		strSet.add("김가흘");
		strSet.add("김가흘2");
		strSet.add("김가흘3");
		strSet.add("김가흘4"); //순서없음
		
		System.out.println(strSet);
		
		//삭제(값에 바로 접근)
		strSet.remove("가흘3");
		System.out.println(strSet);
		
		Iterator<String> ir = strSet.iterator();
		while(ir.hasNext()) {
			String str = ir.next(); //처음부터 끝까지 순회한다
			if(str.equals("김가흘")) {
				System.out.println(str);			
			}
		}
		
		

	}

}

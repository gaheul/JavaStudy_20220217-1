package a18_컬렉션;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class HashMapTest2 {

	public static void main(String[] args) {
		/*
		 * 텀블러 -> tumbler
		 * 머그컵 -> mugCup
		 * 아메리카노 -> americano
		 * 책 -> book 
		 */
		String str = "텀블러";
		
		HashMap<String, String> hashMap = new HashMap<String,String>();
		hashMap.put("머그컵", "mugCup");
		hashMap.put("텀블러", "tumbler");
		hashMap.put("아메리카노", "americano");
		hashMap.put("책", "book");
		
		if(hashMap.containsKey(str)) {
			System.out.println(hashMap.get(str));
		}else {
			System.out.println("해당 단어는 번역할 수 없습니다.");
		}
		
		Set<String> set = hashMap.keySet(); //set자료형으로 바꿔줌
		Iterator<String> ir = set.iterator(); //key값들을 set으로
		while(ir.hasNext()) {
			System.out.println(hashMap.get(ir.next()));
		}
		
		
		if(str.equals("머그컵")) {
			System.out.println("mugCup");
		}else if(str.equals("텀블러")) {
			System.out.println("tumbler");
		}else if(str.equals("아메리카노")) {
			System.out.println("americano");
		}else if(str.equals("책")) {
			System.out.println("book");
		}else {
			System.out.println("해당 단어는 번역할 수 없습니다.");
		}
		
	}

}

package a18_컬렉션;

import java.util.HashMap;


public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String,String>();
		hashMap.put("가", "김가흘");
		hashMap.put("나", "김가흘2");
		hashMap.put("다", "김가흘3");
		hashMap.put("라", "김가흘4");
		hashMap.put("마", "김가흘5");
		
		System.out.println(hashMap);
		System.out.println();
		System.out.println(hashMap.get("다")); //value값 출력
		System.out.println(hashMap.containsValue("김가흘4"));
		System.out.println(hashMap.remove("라"));
		System.out.println(hashMap);
		System.out.println(hashMap.replace("마", "김가흘6"));
		System.out.println(hashMap);
		
	}

}

import java.util.*;

class ArrayList_Test1 {
	public static void main(String ar[]) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("mango");
		list.add("melon");
		list.add("grape");
		list.add(null);
		list.add(2,"strawberry"); // 2번째 방에 딸기 넣음 --> 원하는 위치에 삽입 가능

		System.out.println(list.get(3)); // 멜론 가져오기
		list.remove(2); // 망고 삭제
		System.out.println(list.size()); // 방 사이즈
		
		System.out.println(list.indexOf("mango")); // 망고 위치 알기
		list.clear(); // 다 지워짐

		//System.out.println(list); <출력문>

		/*for(String fruit: list) {
			System.out.println(fruit); // fruit는 변수명이니 바껴도 됨 <출력문> 
		} */

		Iterator<String> it=list.iterator(); // 객체생성
		while (it.hasNext()) { // 다음 데이터가 있으면
			String s=it.next(); // 데이터를 s에 대입
			System.out.println(s+"\t"); // 출력
		}
	}
}
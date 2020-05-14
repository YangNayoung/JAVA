import java.util.*;

class ArrayList_Test1 {
	public static void main(String ar[]) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("mango");
		list.add("melon");
		list.add("grape");
		list.add(null);
		list.add(2,"strawberry"); // 2��° �濡 ���� ���� --> ���ϴ� ��ġ�� ���� ����

		System.out.println(list.get(3)); // ��� ��������
		list.remove(2); // ���� ����
		System.out.println(list.size()); // �� ������
		
		System.out.println(list.indexOf("mango")); // ���� ��ġ �˱�
		list.clear(); // �� ������

		//System.out.println(list); <��¹�>

		/*for(String fruit: list) {
			System.out.println(fruit); // fruit�� �������̴� �ٲ��� �� <��¹�> 
		} */

		Iterator<String> it=list.iterator(); // ��ü����
		while (it.hasNext()) { // ���� �����Ͱ� ������
			String s=it.next(); // �����͸� s�� ����
			System.out.println(s+"\t"); // ���
		}
	}
}
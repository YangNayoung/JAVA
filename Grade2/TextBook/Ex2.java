// String Buffer Ŭ����
public class Ex2 {

	public static void main(String[] args) {
		
		// 9.StringBuffer ��ü sb1�� java programming�� �ְ�, b2�� project�� ���� ��, sb1�� "project"���ڿ��� �߰��Ͽ� str1�� �ְ�, sb1�� sb2�� �߰��Ͽ� 
		// str2�� ������ �� ����Ͻÿ�
			StringBuffer sb1 = new StringBuffer(" Java Programming");
			StringBuffer sb2 = new StringBuffer(" Project");
			String str23 = null;
			StringBuffer str1 = null;
			StringBuffer str2 = null;
			str1 = sb1.append(" Project");
			str2 = sb1.append(sb2);
			System.out.println("sb1 = " + sb1);
			System.out.println("sb2 = " + sb2);
			System.out.println("str1 = " + str1);
			System.out.println("str2 = " + str2);
			System.out.println();
				
		//10. StringBuffer ��ü sb1�� java programming�� ������ �� java�� JAVA�� ġȯ�� �� sb2�� �Ҵ��� �� ����Ͻÿ�.
			sb2 = sb1.replace(0, 5, "JAVA");
			System.out.println("sb2 = " + sb2);
			System.out.println();
			
		//11. StringBuffer ��ü sb1�� java programming�� ������ �� �Ųٷ� ����� ���ڿ��� sb3�� �Ҵ��� �� ����Ͻÿ�.
			sb2 = sb1.reverse();
			System.out.println("sb2 = " + sb2);
			System.out.println();
			
		//12. StringBuffer ��ü sb1�� java programming�� ������ �� ��� �빮�ڷ� ����Ͻÿ�
			str23 = sb1.toString();
			System.out.println("str23.toUpperCase() = " + str23.toUpperCase());
			System.out.println();
	}

}

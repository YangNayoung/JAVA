// �̸�, ���̸� �Է¹޾� 5�� ���

import java.util.*;

class do_while_4 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ��� :");
		String name = sc.next();
		System.out.println("������ �Է��ϼ��� :");
		String age = sc.next();
		int i =1;
		do
		{
			System.out.println(name);
			System.out.println(age);
			i++;
		} while (i<=5);
}
}
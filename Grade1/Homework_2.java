// 2. (ȭ���µ� - 32) / 1.8 = �����µ� �̰� ȭ���µ��� 100�� �϶� �����µ� ���ϱ�

import java.util.*;
class Homework_2 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		float h = sc.nextFloat();
		double s=0;
		s= (h - 32) / 1.8;
		System.out.println("ȭ���µ��� "+h+"���� �� �����µ� : "+s);
	}
}
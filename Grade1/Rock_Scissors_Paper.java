// ����������

import java.util.*;

class Rock_Scissors_Paper {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ö���� ����� ������������ �մϴ�. (���� , ����, �� �� ����)");
		System.out.println("ö��:");
		String c = sc. next();
		System.out.println("����:");
		String y = sc. next();
		// �Ѵ� ������ �� ��
		if (c.equals(y))
		{
			System.out.println("���º�");
		}
		// ö���� ����
		if (c.equals("����"))
		{
			if(y.equals("����"))
			{
				System.out.println("���� ��");
			}
			else if(y.equals("��"))
			{
				System.out.println("ö�� ��");
			}
			// ö���� ����
		}
		if (c.equals("����"))
		{
			if(y.equals("��"))
			{
				System.out.println("���� ��");
			}
			else if(y.equals("����"))
			{
				System.out.println("ö�� ��");
			}
		}
		// ö���� ��
		if (c.equals("��"))
		{
			if(y.equals("����"))
			{
				System.out.println("���� ��");
			}
			else if(y.equals("����"))
			{
				System.out.println("ö�� ��");
			}
		}
	}
}
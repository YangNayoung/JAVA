//  �ΰ��� ������ �Է¹޾� �� ���� ���̿� 5�� ����� ������ ������ ���
import java.util.*;

class NYteacher2 {
	public static void main(String ar[]) {
		System.out.println(" �ΰ��� ���� �Է� " );
		Scanner sc = new Scanner (System.in);

		int n = sc.nextInt();
		int n2 = sc.nextInt();
		int count = 0;

		while (n<=n2)
		{
			if (n%5==0)
			{
				count++;
			}
			n++;
		}
		System.out.println(" �Է��� �� ���� ������ 5�� ��� ������ "+count+"�� �Դϴ�.");
	}
}


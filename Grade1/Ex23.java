//�� ���� ������ �Է¹޾� �� �� ���� ���̿��� 3�� ����̰ų� 5�� ����� ������  �հ� ����� ���

import java.util.*;

class Ex23 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("�� ������ �Է�---> 2���� ������ 3�� ����̰ų� 5�ǹ�� ��, ��� ���");
	    int a = sc.nextInt();
		int b = sc.nextInt();
		int sum=0;
		int Aver=0;
		int count=0;
		for (int i=a; i<=b ; i++ )
		{
		if(i%3==0 || i%5==0) {
			sum=sum+i;
			count++;
			//Aver=sum/count;
	}
		}
		System.out.println("��"+sum);
		Aver=sum/count;
		System.out.println("���"+Aver);
	}
}